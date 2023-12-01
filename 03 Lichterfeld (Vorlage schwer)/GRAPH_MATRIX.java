import java.util.Objects;

@SuppressWarnings("GrazieInspection")

/**
 * Klasse GRAPH_MATRIX
 * Klasse für einen ungerichteten, gewichteten Graphen.
 * Als Datenstruktur wird eine Adjazenzmatrix verwendet
 *
 */

public class GRAPH_MATRIX
{
    // aktuelle Knotenanzahl
    private int anzahlKnoten;

    // Feld der Knoten des Graphen
    private final KNOTEN[] knoten;

    // 2-dim Feld der Adjazenzmatrix
    private final int[][] matrix;

    DARSTELLUNG darstellung;

    /**
     * Konstruktor für Objekte der Klasse GRAPH_MATRIX.
     * Die maximale Anzahl der Knoten wird dabei festgelegt
     *
     * @param   maximaleKnoten   Anzahl der maximal möglichen Knoten
     *
     */
    public GRAPH_MATRIX(int maximaleKnoten)
    {
        darstellung = new DARSTELLUNG();
        darstellung.eigentlichKnoten = new KREIS[maximaleKnoten];
        anzahlKnoten = 0;
        knoten = new KNOTEN[maximaleKnoten];
        matrix = new int[maximaleKnoten][maximaleKnoten];
    }

    public void Ausgeben()
    {
        //Kopfzeile
        System.out.printf("%-8s" , "");
        for (int i = 0; i < anzahlKnoten; i++) {
            System.out.printf("%-8s" , knoten[i].BezeichnungGeben());
        }
        System.out.println();

        //Matrix mit linkem Rand
        for (int i = 0; i < anzahlKnoten; i++) {
            System.out.printf("%-8s" , knoten[i].BezeichnungGeben());
            for (int j = 0; j < anzahlKnoten; j++) {
                if (matrix[i][j] != -1)
                {
                    System.out.printf("%-8s" , matrix[i][j]);
                }
                else
                {
                    System.out.printf("%-8s" , "-1");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public int KnotenNummer (String bezeichner)
    {
        int ergeb = -1;
        for (int i = 0; i < anzahlKnoten; i++)
        {
            if (Objects.equals(knoten[i].BezeichnungGeben(), bezeichner))
            {
                ergeb = i;
            }
        }

        return ergeb;
    }

    public void KnotenEinfuegen(String bezeichner)
    {
        if(anzahlKnoten < knoten.length && KnotenNummer(bezeichner) == -1)
        {
            knoten[anzahlKnoten] = new KNOTEN(bezeichner);
            matrix[anzahlKnoten][anzahlKnoten] = 0;
            darstellung.KnotenEinfuegen(bezeichner);
            for (int i = 0; i < anzahlKnoten; i++)
            {
                matrix[anzahlKnoten][i] = -1;
                matrix[i][anzahlKnoten] = -1;
            }
            anzahlKnoten++;
        }
        else
        {
            System.out.println("Fehler in KnotenEinfuegen!");
            System.out.println("Liegt wahrscheinlich daran, dass kein Platz mehr im Array ist, oder der Bezeichner schon existiert.");
            System.out.println();
        }

    }

    public void KanteEinfuegen(String von, String nach, int gewichtung)
    {
        int vonNummer = KnotenNummer(von);
        int nachNummer= KnotenNummer(nach);
        if (vonNummer != -1 && nachNummer != -1 && vonNummer != nachNummer)
        {
            matrix[vonNummer][nachNummer] = gewichtung;
            matrix[nachNummer][vonNummer] = gewichtung;
        }
    }

    public void KanteLoeschen(String von, String nach)
    {
        int vonNummer = KnotenNummer(von);
        int nachNummer= KnotenNummer(nach);
        if (vonNummer != -1 && nachNummer != -1 && vonNummer != nachNummer)
        {
            matrix[vonNummer][nachNummer] = -1;
            matrix[nachNummer][vonNummer] = -1;
        }
    }

    public String KnotenBezeichnerGeben(int knotennummer)
    {
        if(knotennummer > anzahlKnoten)
        {
            System.out.println("Unter dieser Knotennummer ist kein Knoten vorhanden");
            return null;
        }
        System.out.println("Der Knoten hat den Bezeichner " + knoten[knotennummer].BezeichnungGeben());
        System.out.println();
        return knoten[knotennummer].BezeichnungGeben();
    }

    public int KanteGewichtGeben( String von, String nach)
    {
        int vonNummer = KnotenNummer(von);
        int nachNummer= KnotenNummer(nach);
        int gewichtung = 0;
        if (vonNummer != -1 && nachNummer != -1 && vonNummer != nachNummer)
        {
            gewichtung = matrix[vonNummer][nachNummer];
            System.out.println("Das Gewicht der Kanten " + von + " nach " + nach + " ist: " + gewichtung);
        }
        else
        {
            System.out.println("Fehler bei KanteGewichtGeben");
        }
        return gewichtung;
    }

    public int KnotenAnzahl()
    {
        System.out.println("Es gibt "+ this.anzahlKnoten + " Knoten");
        return this.anzahlKnoten;
    }
}

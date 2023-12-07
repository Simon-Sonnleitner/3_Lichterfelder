import ea.edu.Kreis;

public class DARSTELLUNG extends SPIEL {
    public KREIS[] eigentlichKnoten;

    public TEXT[] bezeichnerKnoten;

    public int anzahlKnoten = 0;

    public DARSTELLUNG() {
        super(750, 750);
        this.setzeHintergrundgrafik("hintergrund.jpg");
        DARSTELLUNG.zeigeKoordinatensystem(true);
        eigentlichKnoten = new KREIS[10];
    }

    public void KnotenEinfuegen(String bezeichner) {
        KREIS neuerKnoten = new KREIS();
        eigentlichKnoten[anzahlKnoten] = neuerKnoten;
        int temp = 0;
        while (beruehrtKreis(eigentlichKnoten[anzahlKnoten]) || temp==0) {
            double KreisX = super.zufallsKommazahlVonBis(-10, 10);
            double KreisY = super.zufallsKommazahlVonBis(-10, 10);
            neuerKnoten.setzeMittelpunkt(KreisX, KreisY);
            TEXT neuerBezeichner = new TEXT(KreisX, KreisY, 2, bezeichner);
            temp++;
        }
        anzahlKnoten++;
    }

    public boolean beruehrtKreis(KREIS k) {
        for (int i = 0; i < eigentlichKnoten.length; i++)
        {
            return k.beruehrt(eigentlichKnoten[i]);
        }
        return false;
    }

    public void KanteEinfuegen(int von, int nach)
    {
        /**
         * Rechteck verwenden
         */
    }
}


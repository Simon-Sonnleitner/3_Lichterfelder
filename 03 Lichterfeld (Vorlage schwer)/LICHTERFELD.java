
public class LICHTERFELD extends SPIEL
{
    //TODO: Deklariere ein zweidimensionales Array zur Verwaltung von Objekten der Klasse KREIS. Nenne das Array 'feld'.
    private final KREIS[][]feld;


    public LICHTERFELD()
    {
        //1 Bildschirmmeter entspricht 30 Pixel. Das Fenster reicht also von -10 bis 10.
        super( 750 , 750);
        this.setzeHintergrundgrafik("hintergrund.jpg");
        
        //TODO: Initialisiere das zweidimensionale Array mit den Dimensionen 5 x 5.
        feld = new KREIS[5][5];

        //TODO: Platziere die 25 Kreisobjekte gleichmäßig im Fenster.

        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                this.feld[i][j] = new KREIS(1.5);
                this.feld[i][j].setzeMittelpunkt(10-5*i, 10-5*j);
                this.feld[i][j].setzeFarbe("schwarz");
            }
        }
        LICHTERFELD.zeigeKoordinatensystem(true);
    }

    //TODO Methode LampeEinschalten(int x, int y).
    public void LampeEinschalten(int x, int y)
    {
        feld[x][y].setzeFarbe("gelb");
    }

    //TODO Methode LampeAusschalten(int x, int y).

    public void LampeAusschalten(int x, int y)
    {
        feld[x][y].setzeFarbe("schwarz");
    }

    //TODO Methode AlleLampenAusschalten().

    public void AlleLampenAusschalten()
    {
        for (KREIS[] kreis : feld) {
            for (int j = 0; j < feld.length; j++) {
                kreis[j].setzeFarbe("schwarz");
            }
        }
    }

    //TODO Methode AlleLampenEinschalten().

    public void AlleLampenEinschalten()
    {
        for (KREIS[] kreis : feld) {
            for (int j = 0; j < feld.length; j++) {
                kreis[j].setzeFarbe("gelb");
            }
        }
    }

    //TODO Methode AbwechselndEinschalten().

    public void AbwechselndEinschalten()
    {
        for (int i = 0; i < feld.length; i++)
        {
            if ((i % 2) == 0)
            {
                for (int j = 1; j < feld.length; j += 2)
                {
                    feld[i][j].setzeFarbe("gelb");
                }

            } else
            {
                for (int j = 0; j < feld.length; j += 2)
                {
                    feld[i][j].setzeFarbe("gelb");
                }
            }
        }

    }

    public void burgiCode()
    {
        for (int i = 0; i < feld.length; i++)
        {
            for (int j = ( i % 2 ) > 0 ? 1 : 0; j < feld.length; j+=2)
            {
                this.feld[i][j].setzeFarbe("weiß");
            }
        }
    }
}

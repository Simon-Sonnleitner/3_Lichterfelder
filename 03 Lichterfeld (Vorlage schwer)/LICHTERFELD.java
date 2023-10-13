
public class LICHTERFELD extends SPIEL
{
    //TODO: Deklariere ein zweidimensionales Array zur Verwaltung von Objekten der Klasse KREIS. Nenne das Array 'feld'.
    private KREIS[][]feld;

    public LICHTERFELD()
    {
        //1 Bildschirmmeter entspricht 30 Pixel. Das Fenster reicht also von -10 bis 10.
        super( 750 , 750);
        this.setzeHintergrundgrafik("hintergrund.jpg");
        
        //TODO: Initialisiere das zweidimensionale Array mit den Dimensionen 5 x 5.
        feld = new KREIS[5][5];
        //TODO: Platziere die 25 Kreisobjekte gleichmäßig im Fenster.
        
        for(int i = 0; i < feld.length; i++)
        {
            for( int j = 0; i < feld.length; j++)
            {
                feld[i][j] = new KREIS();
            }
        }
        
        this.zeigeKoordinatensystem(true);
    }

    //TODO Methode LampeEinschalten(int x, int y).
    public void LampeEinschaleten(int x, int y)
    {
        feld[x][y].setzeFarbe("gelb");
    }

    //TODO Methode LampeAusschalten(int x, int y).

    //TODO Methode AlleLampenAusschalten().

    //TODO Methode AlleLampenEinschalten().

    //TODO Methode AbwechselndEinschalten().


}

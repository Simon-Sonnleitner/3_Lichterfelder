public class DARSTELLUNG extends SPIEL
{
    KREIS[][] feld;
    public DARSTELLUNG()
    {
        super ( 750 , 750);
        this.setzeHintergrundgrafik("hintergrund.jpg");
        DARSTELLUNG.zeigeKoordinatensystem(true);
    }

}

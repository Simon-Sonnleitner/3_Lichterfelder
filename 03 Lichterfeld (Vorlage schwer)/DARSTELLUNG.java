public class DARSTELLUNG extends SPIEL
{
    public KREIS[] eigentlichKnoten;
    public TEXT[] bezeichnerKnoten;
    public int anzahlKnoten = 0;
    public DARSTELLUNG()
    {
        super ( 750 , 750);
        this.setzeHintergrundgrafik("hintergrund.jpg");
        DARSTELLUNG.zeigeKoordinatensystem(true);
    }

    public void KnotenEinfuegen(double x, double y, String bezeichner)
    {
        KREIS neuerKnoten = new KREIS();
        eigentlichKnoten[anzahlKnoten] = neuerKnoten;
        while (textBeruehrung(eigentlichKnoten[anzahlKnoten]))
        {
            super.zufallsKommazahlVonBis(0,10);
        }
        neuerKnoten.setzeMittelpunkt(x,y);
        anzahlKnoten++;
        TEXT neuerBezeichner = new TEXT(x,y,2,bezeichner);

    }
    public boolean textBeruehrung(KREIS k)
    {
        for (int i = 0; i < anzahlKnoten; i++) {
            if (k.beruehrt(eigentlichKnoten[i]))
            {
                return true;
            }
        }
        return false;
    }

}

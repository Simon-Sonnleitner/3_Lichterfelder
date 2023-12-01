import ea.edu.Kreis;

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
        eigentlichKnoten  = new KREIS[10];
    }

    public void KnotenEinfuegen(String bezeichner)
    {
        KREIS neuerKnoten = new KREIS();
        eigentlichKnoten[anzahlKnoten] = neuerKnoten;
        while (textBeruehrung(eigentlichKnoten[anzahlKnoten]))
        {
            double KreisX= super.zufallsKommazahlVonBis(-10,10);
            double KreisY = super.zufallsKommazahlVonBis(-10,10);
            neuerKnoten.setzeMittelpunkt(KreisX, KreisY);
            TEXT neuerBezeichner = new TEXT(KreisX,KreisY,2,bezeichner);
        }
        anzahlKnoten++;
    }
    public boolean textBeruehrung(KREIS k)
    {
        for (int i = 0; i < eigentlichKnoten.length; i++) {
            if (k.beruehrt(eigentlichKnoten[i]))
            {
                return true;
            }
        }
        return false;
    }

}

/**
 * Klasse KNOTEN.
 * für die Darstellungen eines Graphen mittels Adjazenzmatrix
 *
 */

public class KNOTEN
{
    private final String bezeichnung;


    /**
     * Konstruktor für Objekte der Klasse KNOTEN
     */
    public KNOTEN(String neuerWert)
    {
        bezeichnung = neuerWert;
    }


    /**
     * Gibt den Bezeichner des Knotenobjekts zurück
     *
     * @return  Bezeichner
     *
     */
    public String BezeichnungGeben()
    {
        return bezeichnung;
    }

}
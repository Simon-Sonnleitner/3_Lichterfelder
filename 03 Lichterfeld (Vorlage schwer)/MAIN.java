public class MAIN
{
    public static void main(String[] args) {
//        LICHTERFELD lichterfeld = new LICHTERFELD();
//        lichterfeld.AlleLampenAusschalten();
//        lichterfeld.AbwechselndEinschalten();
        GRAPH_MATRIX graph_matrix = new GRAPH_MATRIX(10);
        graph_matrix.KnotenEinfuegen("A");
        graph_matrix.KnotenEinfuegen("B");
        graph_matrix.KnotenEinfuegen("C");
        graph_matrix.KnotenEinfuegen("D");
        graph_matrix.KanteEinfuegen("A", "B",2);
        graph_matrix.KanteEinfuegen("A", "C",2);
        graph_matrix.KanteEinfuegen("A", "D",2);
        graph_matrix.BreitendurchlaufAusfuehren("A");
//                graph_matrix.Ausgeben();
//                graph_matrix.KanteEinfuegen("A","B",50);
//                graph_matrix.KanteEinfuegen("A","A",50);
//                graph_matrix.Ausgeben();
//                graph_matrix.KnotenBezeichnerGeben(1);
//                graph_matrix.KanteGewichtGeben("A", "B");

    }
}

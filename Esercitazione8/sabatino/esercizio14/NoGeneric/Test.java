package sabatino.esercizio14.NoGeneric;

public class Test {
	public static void main(String[] args){
		DenseGraph grafo = new DenseGraph();
		System.out.println("vertici del grafo");
		grafo.addVertex(4);
		grafo.addVertex(8);
		grafo.addVertex(11);
		grafo.addVertex(3);
		grafo.addVertex(5);
		grafo.addVertex(9);
		grafo.printVertex();
		System.out.println("archi del grafo");
		grafo.addEdge(4, 8, "4-8");
		grafo.addEdge(4, 11, "4-11");
		grafo.addEdge(3, 8, "3-8");
		grafo.addEdge(5, 9, "5-9");
		grafo.printNeighbors(4);
		grafo.printNeighbors(3);
		grafo.printNeighbors(5);
		System.out.println("numero nodi: "+grafo.n);
		System.out.println("numero arch: "+grafo.m);
	}
}

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        BusquedaBFSDFS busqueda = new BusquedaBFSDFS(grafo);

        String estadoInicial = "NY";
        String estadoObjetivo = "LA";

        System.out.println("=== Primero en Anchura (BFS) ===");
        busqueda.busquedaBFS(estadoInicial, estadoObjetivo);

        System.out.println("\n=== Primero en Profundidad (DFS) ===");
        busqueda.busquedaDFS(estadoInicial, estadoObjetivo);
    }
}
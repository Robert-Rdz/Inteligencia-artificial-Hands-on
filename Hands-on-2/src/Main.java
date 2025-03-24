public class Main {
    public static void main(String[] args) {
        int[][] mapa = {
                {0, 0, 0, 1},
                {1, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 1, 1, 0}
        };

        Grafo grafo = new Grafo(4, 4, mapa);
        BusquedaBFSDFS busqueda = new BusquedaBFSDFS(grafo);

        int[] estadoInicial = {3, 0};
        int[] estadoObjetivo = {1, 1};

        System.out.println("=== Primero en Anchura (BFS) ===");
        busqueda.busquedaBFS(estadoInicial, estadoObjetivo);

        System.out.println("\n=== Primero en Profundidad (DFS) ===");
        busqueda.busquedaDFS(estadoInicial, estadoObjetivo);
    }
}
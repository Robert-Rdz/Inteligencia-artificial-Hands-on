import java.util.*;

public class BusquedaBFSDFS {
    private Grafo grafo;

    public BusquedaBFSDFS(Grafo grafo) {
        this.grafo = grafo;
    }

    public void busquedaBFS(int[] inicio, int[] objetivo) {
        Map<String, int[]> abierta = new HashMap<>();
        Map<String, int[]> cerrada = new HashMap<>();
        Map<String, String> padres = new HashMap<>();
        Queue<int[]> cola = new LinkedList<>();

        abierta.put(Arrays.toString(inicio), inicio);
        cola.add(inicio);

        while (!cola.isEmpty()) {
            int[] actual = cola.poll();
            String claveActual = Arrays.toString(actual);
            cerrada.put(claveActual, actual);

            if (Arrays.equals(actual, objetivo)) {
                System.out.println("Objetivo encontrado (BFS): " + Arrays.toString(actual));
                imprimirRuta(padres, Arrays.toString(inicio), claveActual);
                return;
            }

            for (int[] descendiente : grafo.obtenerDescendientes(actual)) {
                String claveDesc = Arrays.toString(descendiente);

                if (!cerrada.containsKey(claveDesc) && !abierta.containsKey(claveDesc)) {
                    abierta.put(claveDesc, descendiente);
                    padres.put(claveDesc, claveActual);
                    cola.add(descendiente);
                }
            }
        }

        System.out.println("No se encontró una solución con BFS.");
    }

    public void busquedaDFS(int[] inicio, int[] objetivo) {
        Map<String, int[]> abierta = new HashMap<>();
        Map<String, int[]> cerrada = new HashMap<>();
        Map<String, String> padres = new HashMap<>();
        Stack<int[]> pila = new Stack<>();

        abierta.put(Arrays.toString(inicio), inicio);
        pila.push(inicio);

        while (!pila.isEmpty()) {
            int[] actual = pila.pop();
            String claveActual = Arrays.toString(actual);
            cerrada.put(claveActual, actual);

            if (Arrays.equals(actual, objetivo)) {
                System.out.println("Objetivo encontrado (DFS): " + Arrays.toString(actual));
                imprimirRuta(padres, Arrays.toString(inicio), claveActual);
                return;
            }

            for (int[] descendiente : grafo.obtenerDescendientes(actual)) {
                String claveDesc = Arrays.toString(descendiente);

                if (!cerrada.containsKey(claveDesc) && !abierta.containsKey(claveDesc)) {
                    abierta.put(claveDesc, descendiente);
                    padres.put(claveDesc, claveActual);
                    pila.push(descendiente);
                }
            }
        }

        System.out.println("No se encontró una solución con DFS.");
    }

    private void imprimirRuta(Map<String, String> padres, String inicio, String objetivo) {
        List<String> ruta = new ArrayList<>();
        String actual = objetivo;

        while (actual != null) {
            ruta.add(0, actual);
            actual = padres.get(actual);
        }

        System.out.print("Ruta encontrada: ");
        for (String i : ruta) {
            System.out.print(i+" : ");
        }
        System.out.println();
    }
}
import java.util.*;

public class BusquedaBFSDFS {
    private Grafo grafo;

    public BusquedaBFSDFS(Grafo grafo) {
        this.grafo = grafo;
    }

    public void busquedaBFS(String estadoInicial, String estadoObjetivo) {
        if (!grafo.contieneEstado(estadoInicial) || !grafo.contieneEstado(estadoObjetivo)) {
            System.out.println("Estado inicial o objetivo no válido.");
            return;
        }

        Queue<Nodo> abierta = new LinkedList<>();
        Set<String> cerrada = new HashSet<>();
        abierta.add(new Nodo(estadoInicial, null));

        while (!abierta.isEmpty()) {
            Nodo nodoActual = abierta.poll();
            cerrada.add(nodoActual.getEstado());

            if (nodoActual.getEstado().equals(estadoObjetivo)) {
                System.out.println("Objetivo encontrado: " + nodoActual.getEstado());
                imprimirSolucion(nodoActual);
                return;
            }

            for (String descendiente : grafo.obtenerDescendientes(nodoActual.getEstado())) {
                if (!cerrada.contains(descendiente)) {
                    abierta.add(new Nodo(descendiente, nodoActual));
                }
            }
        }

        System.out.println("No se encontró una solución con BFS.");
    }

    public void busquedaDFS(String estadoInicial, String estadoObjetivo) {
        if (!grafo.contieneEstado(estadoInicial) || !grafo.contieneEstado(estadoObjetivo)) {
            System.out.println("Estado inicial o objetivo no válido.");
            return;
        }

        Stack<Nodo> abierta = new Stack<>();
        Set<String> cerrada = new HashSet<>();
        abierta.push(new Nodo(estadoInicial, null));

        while (!abierta.isEmpty()) {
            Nodo nodoActual = abierta.pop();
            cerrada.add(nodoActual.getEstado());

            if (nodoActual.getEstado().equals(estadoObjetivo)) {
                System.out.println("Objetivo encontrado: " + nodoActual.getEstado());
                imprimirSolucion(nodoActual);
                return;
            }

            for (String descendiente : grafo.obtenerDescendientes(nodoActual.getEstado())) {
                if (!cerrada.contains(descendiente)) {
                    abierta.push(new Nodo(descendiente, nodoActual));
                }
            }
        }

        System.out.println("No se encontró una solución con DFS.");
    }

    private void imprimirSolucion(Nodo nodo) {
        List<String> ruta = new ArrayList<>();
        while (nodo != null) {
            ruta.add(nodo.getEstado());
            nodo = nodo.getPadre();
        }
        Collections.reverse(ruta);
        System.out.println("Ruta de solución: " + String.join(" -> ", ruta));
    }
}
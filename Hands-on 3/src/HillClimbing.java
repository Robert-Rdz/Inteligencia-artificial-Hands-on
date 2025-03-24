import java.util.*;

public class HillClimbing {
    private Nodo estadoInicial;
    private Nodo estadoFinal;

    public HillClimbing(Nodo estadoInicial, Nodo estadoFinal) {
        this.estadoInicial = estadoInicial;
        this.estadoFinal = estadoFinal;
    }

    public void buscar() {
        Nodo nodoActual = estadoInicial;

        while (true) {
            System.out.println("Nodo actual: " + nodoActual);

            if (nodoActual.equals(estadoFinal)) {
                mostrarSolucion(nodoActual);
                return;
            }

            List<Nodo> descendientes = nodoActual.obtenerDescendientes();
            if (descendientes.isEmpty()) {
                System.out.println("No hay descendientes inmediatos.");
                return;
            }

            Nodo mejorDescendiente = seleccionarMejorDescendiente(descendientes);

            if (mejorDescendiente.getValorHeuristico() <= nodoActual.getValorHeuristico()) {
                System.out.println("No se encontró mejoría.");
                return;
            }

            mejorDescendiente.setNodoPadre(nodoActual);
            nodoActual = mejorDescendiente;
        }
    }

    private Nodo seleccionarMejorDescendiente(List<Nodo> descendientes) {
        return Collections.max(descendientes, Comparator.comparingInt(Nodo::getValorHeuristico));
    }

    private void mostrarSolucion(Nodo nodo) {
        List<Nodo> camino = new ArrayList<>();
        System.out.println("Camino hacia la solución:");
        while (nodo != null) {
            camino.add(nodo);
            nodo = nodo.getNodoPadre();
        }
        Collections.reverse(camino);
        for (Nodo i : camino) {
            System.out.println(i);
        }
    }
}
import java.util.*;

public class Grafo {
    private Map<String, List<String>> adyacencias;

    public Grafo() {
        adyacencias = new HashMap<>();
        inicializarGrafo();
    }

    private void inicializarGrafo() {
        adyacencias.put("NY", Arrays.asList("TOR", "CHI", "DEN"));
        adyacencias.put("CHI", Arrays.asList("DEN"));
        adyacencias.put("DEN", Arrays.asList("LA", "HW"));
        adyacencias.put("TOR", Arrays.asList("CALG", "LA"));
        adyacencias.put("LA", Arrays.asList());
        adyacencias.put("URB", Arrays.asList());
        adyacencias.put("CALG", Arrays.asList());
        adyacencias.put("HW", Arrays.asList("URB", "LA"));
    }

    public List<String> obtenerDescendientes(String estado) {
        return adyacencias.getOrDefault(estado, new ArrayList<>());
    }

    public boolean contieneEstado(String estado) {
        return adyacencias.containsKey(estado);
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Nodo {
    private String nombre;
    private int valorHeuristico;
    private Nodo nodoPadre;
    private List<Nodo> descendientes;

    public Nodo(String nombre, int valorHeuristico) {
        this.nombre = nombre;
        this.valorHeuristico = valorHeuristico;
        this.descendientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getValorHeuristico() {
        return valorHeuristico;
    }

    public Nodo getNodoPadre() {
        return nodoPadre;
    }

    public void setNodoPadre(Nodo nodoPadre) {
        this.nodoPadre = nodoPadre;
    }

    public void agregarDescendiente(Nodo descendiente) {
        descendientes.add(descendiente);
    }

    public List<Nodo> obtenerDescendientes() {
        return descendientes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Nodo nodo = (Nodo) obj;
        return Objects.equals(nombre, nodo.nombre);
    }

    @Override
    public String toString() {
        return nombre + " (Heurística: " + valorHeuristico + ")";
    }
}
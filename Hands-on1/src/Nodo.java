public class Nodo {
    String estado;
    Nodo padre;

    public Nodo(String estado, Nodo padre) {
        this.estado = estado;
        this.padre = padre;
    }

    public String getEstado() {
        return estado;
    }

    public Nodo getPadre() {
        return padre;
    }
}
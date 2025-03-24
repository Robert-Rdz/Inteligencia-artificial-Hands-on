import java.util.*;

public class Grafo {
    private int filas;
    private int columnas;
    private int[][] mapa;

    public Grafo(int filas, int columnas, int[][] mapa) {
        this.filas = filas;
        this.columnas = columnas;
        this.mapa = mapa;
    }

    public List<int[]> obtenerDescendientes(int[] estado) {
        int x = estado[0];
        int y = estado[1];
        List<int[]> descendientes = new ArrayList<>();

        int[][] movimientos = {
                {x - 1, y}, // Arriba
                {x + 1, y}, // Abajo
                {x, y - 1}, // Izquierda
                {x, y + 1}  // Derecha
        };

        for (int[] mov : movimientos) {
            int nx = mov[0];
            int ny = mov[1];

            if (nx >= 0 && nx < filas && ny >= 0 && ny < columnas && mapa[nx][ny] != 1) {
                descendientes.add(new int[]{nx, ny});
            }
        }

        return descendientes;
    }
}
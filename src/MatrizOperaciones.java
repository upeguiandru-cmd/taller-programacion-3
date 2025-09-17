public class MatrizOperaciones {
    private int[][] matriz;
    private int n;

    public MatrizOperaciones(int n) {
        this.n = n;
        this.matriz = new int[n][n];
        llenarMatriz();
    }

    private void llenarMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (i + 1) - j;
            }
        }
    }

    public void mostrarMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int calcularSumatoria() {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int val : fila) {
                suma += val;
            }
        }
        return suma;
    }

    public int calcularMaximo() {
        int max = Integer.MIN_VALUE;
        for (int[] fila : matriz) {
            for (int val : fila) {
                if (val > max) max = val;
            }
        }
        return max;
    }

    public int calcularMinimo() {
        int min = Integer.MAX_VALUE;
        for (int[] fila : matriz) {
            for (int val : fila) {
                if (val < min) min = val;
            }
        }
        return min;
    }
}


   
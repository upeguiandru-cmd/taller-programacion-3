import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------- EJERCICIO 30 ----------
        System.out.println("=== EJERCICIO 30: OPERACIONES EN MATRIZ ===");
        System.out.print("Ingrese el orden de la matriz: ");
        int n = sc.nextInt();

        MatrizOperaciones matriz = new MatrizOperaciones(n);
        matriz.mostrarMatriz();
        System.out.println("La sumatoria es: " + matriz.calcularSumatoria());
        System.out.println("El valor máximo es: " + matriz.calcularMaximo());
        System.out.println("El valor mínimo es: " + matriz.calcularMinimo());

        // ---------- EJERCICIO 35 ----------
        System.out.println("\n=== EJERCICIO 35: DESCOMPOSICION EN FACTORES ===");
        System.out.print("Ingrese el número a descomponer: ");
        int numero = sc.nextInt();

        Factorizacion fact = new Factorizacion();
        System.out.println(fact.mostrarFactores(numero));

        sc.close();
    }
}

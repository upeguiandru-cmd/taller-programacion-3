import java.util.ArrayList;
import java.util.List;

public class Factorizacion {

    public List<Integer> descomponer(int numero) {
        List<Integer> factores = new ArrayList<>();
        int n = numero;

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factores.add(i);
                n /= i;
            }
        }
        return factores;
    }

    public String mostrarFactores(int numero) {
        List<Integer> factores = descomponer(numero);
        StringBuilder sb = new StringBuilder();
        sb.append(numero).append(" = ");

        for (int i = 0; i < factores.size(); i++) {
            sb.append(factores.get(i));
            if (i < factores.size() - 1) {
                sb.append(" x ");
            }
        }
        return sb.toString();
    }
}

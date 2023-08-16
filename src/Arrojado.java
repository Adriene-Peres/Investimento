import java.util.*;

public class Arrojado implements TipoInvestidor {

    public double chancePorcenteagem() {
        double s = new Random().nextDouble();
        if (s < 0.65) {
            return 0.003;
        } else if (s >= 0.65 && s < 0.90) {
            return 0.02;
        } else {
            return 0.05;
        }
    }

    @Override
    public double calcularValorInvestimento(double investimento, int tempo) {
        double resultado = investimento;
        for (int i = 0; i < tempo; i++) {
            resultado = resultado + (resultado * chancePorcenteagem());
        }
        return resultado;
    }
}
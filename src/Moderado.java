import java.util.*;

public class Moderado implements TipoInvestidor {
    public double chancePorcenteagem() {
        double s = new Random().nextDouble();
        if (s < 0.8) {
            return 0.006;
        } else {
            return 0.02;
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

public class Conservador implements TipoInvestidor {
    @Override
    public double calcularValorInvestimento(double investimento, int tempo) {
        double resultado = investimento;
        for (int i = 0; i < tempo; i++) {
            resultado = resultado + (resultado * 0.008);
        }
        return resultado;
    }
}

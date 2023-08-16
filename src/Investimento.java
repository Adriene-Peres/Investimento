public class Investimento {
    private TipoInvestidor inv;

    public Investimento(TipoInvestidor inv) {
        this.inv = inv;
    }

    public double calcularInvestimento(double valor, int tempo) {
        return inv.calcularValorInvestimento(valor, tempo);
    }

}
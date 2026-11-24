public class Transferencia extends MetodoPago {

    private String banco;

    public Transferencia(String titular, double limite, String banco) {
        super(titular, limite);
        this.banco = banco;
    }

    @Override
    public double calcularComision(double monto) {
        return monto * 0.01;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nMétodo: Transferencia" +
                "\nBanco: " + banco;
    }
}

public class Tarjeta extends MetodoPago {

    private String numero;

    public Tarjeta(String titular, double limite, String numero) {
        super(titular, limite);
        this.numero = numero;
    }

    @Override
    public double calcularComision(double monto) {
        return monto * 0.02;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nMétodo: Tarjeta" +
                "\nNúmero: " + numero;
    }
}

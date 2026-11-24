public class MetodoPago {

    private String titular;
    private double limite;

    public MetodoPago(String titular, double limite) {
        this.titular = titular;
        this.limite = limite;
    }

    public double calcularComision(double monto) {
        return 0;
    }

    public String mostrarInformacion() {
        return "Titular: " + titular +
                "\nLímite: $" + limite;
    }

    public String getTitular() {
        return titular;
    }
}
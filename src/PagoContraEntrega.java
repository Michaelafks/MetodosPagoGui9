public class PagoContraEntrega extends MetodoPago {

    private String direccionEntrega;

    public PagoContraEntrega(String titular, double limite, String direccionEntrega) {
        super(titular, limite);
        this.direccionEntrega = direccionEntrega;
    }

    @Override
    public double calcularComision(double monto) {
        return monto * 0.03;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nMétodo: Pago Contra Entrega" +
                "\nDirección de entrega: " + direccionEntrega;
    }
}

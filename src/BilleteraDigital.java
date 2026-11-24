public class BilleteraDigital extends MetodoPago {

    private String proveedor;

    public BilleteraDigital(String titular, double limite, String proveedor) {
        super(titular, limite);
        this.proveedor = proveedor;
    }

    @Override
    public double calcularComision(double monto) {
        return monto * 0.015;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nMétodo: Billetera Digital" +
                "\nProveedor: " + proveedor;
    }
}
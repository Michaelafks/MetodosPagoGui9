public class Compra {

    private double total;
    private MetodoPago metodoPago;

    public Compra(double total, MetodoPago metodoPago) {
        this.total = total;
        this.metodoPago = metodoPago;
    }

    public double calcularTotalConComision() {
        return total + metodoPago.calcularComision(total);
    }

    public String mostrarInformacion() {
        return "===== INFORMACIÓN DE LA COMPRA =====" +
                "\nMonto de compra: $" + total +
                "\nComisión: $" + metodoPago.calcularComision(total) +
                "\nTotal con comisión: $" + calcularTotalConComision() +
                "\n\n" + metodoPago.mostrarInformacion();
    }
}

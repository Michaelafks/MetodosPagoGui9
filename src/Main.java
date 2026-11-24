public class Main {

    public static void main(String[] args) {

        // Crear métodos de pago
        MetodoPago pago1 = new Tarjeta("Ana", 1000, "****1234");

        MetodoPago pago2 = new Transferencia("Luis", 2000, "Banco X");

        MetodoPago pago3 = new BilleteraDigital("Carlos", 500, "PayPal");

        MetodoPago pago4 = new PagoContraEntrega("Maria", 300, "Av. Amazonas");

        // Crear compras
        Compra compra1 = new Compra(100, pago1);
        Compra compra2 = new Compra(100, pago2);
        Compra compra3 = new Compra(100, pago3);
        Compra compra4 = new Compra(100, pago4);

        // Mostrar información de las compras
        System.out.println("===== COMPRA CON TARJETA =====");
        System.out.println(compra1.mostrarInformacion());

        System.out.println("\n===== COMPRA CON TRANSFERENCIA =====");
        System.out.println(compra2.mostrarInformacion());

        System.out.println("\n===== COMPRA CON BILLETERA DIGITAL =====");
        System.out.println(compra3.mostrarInformacion());

        System.out.println("\n===== COMPRA CONTRA ENTREGA =====");
        System.out.println(compra4.mostrarInformacion());

        // Comparar comisiones
        System.out.println("\n===== COMPARACIÓN DE COMISIONES =====");

        System.out.println("Comisión tarjeta: $" + pago1.calcularComision(100));
        System.out.println("Comisión transferencia: $" + pago2.calcularComision(100));
        System.out.println("Comisión billetera digital: $" + pago3.calcularComision(100));
        System.out.println("Comisión contra entrega: $" + pago4.calcularComision(100));
    }
}

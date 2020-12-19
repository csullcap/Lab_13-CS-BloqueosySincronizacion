public class Impresion extends Thread {
    private Impresora impresora;
    private Empleado empleado;
    private int hojasaimprimir;

    public Impresion(Impresora impresora, Empleado empleado, int paginas) {
        this.impresora = impresora;
        this.empleado = empleado;
        this.hojasaimprimir = paginas;
    }

    @Override
    public void run() {
        imprimir();
        System.out.println("Hojas actuales en la Impresora : " + impresora.getHojas() + "\n");
    }

    public void imprimir() {
        synchronized (impresora) {
            if (hojasaimprimir <= impresora.getHojas()) {
                System.out.println("Se ha aceptado la impresion del empleado " + empleado.getNombre());
                impresora.actualizarHojas(this.hojasaimprimir);
                System.out.println("Se completo la impresion de los documentos del empleado " + empleado.getNombre());
            } else {
                System.out.println(
                        "Se ha rechazado la impresion del empleado " + empleado.getNombre() + " por falta de hojas");
            }
        }
    }

}
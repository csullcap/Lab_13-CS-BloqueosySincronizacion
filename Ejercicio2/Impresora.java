public class Impresora {

    private int hojas;

    public Impresora(int hojas) {
        this.hojas = hojas;
    }

    public int getHojas() {
        return this.hojas;
    }

    public void actualizarHojas(int hojas) {
        this.hojas -= hojas;
    }
}

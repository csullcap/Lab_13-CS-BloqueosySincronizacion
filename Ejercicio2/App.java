public class App {

    public static void main(String[] args) {

        Impresora hp100 = new Impresora(50);

        Empleado e1 = new Empleado("JHON");
        Empleado e2 = new Empleado("CARLOS");
        Empleado e3 = new Empleado("RODRIGO");
        Empleado e4 = new Empleado("ABELARDO");

        Impresion i1 = new Impresion(hp100, e1, 10);
        Impresion i2 = new Impresion(hp100, e2, 15);
        Impresion i3 = new Impresion(hp100, e3, 30);
        Impresion i4 = new Impresion(hp100, e4, 50);

        i1.start();
        i2.start();
        i3.start();
        i4.start();

    }
}

import java.util.List;

public class Coche {
    private boolean motorEncendido;
    private int velocidadActual;
    private int carrilActual;

    public Coche() {
        motorEncendido = false;
        velocidadActual = 0;
        carrilActual = 1;
    }

    public void iniciarMotor() {
        if (!motorEncendido) {
            motorEncendido = true;
            System.out.println("El motor se ha encendido.");
        } else {
            System.out.println("El motor ya está encendido.");
        }
    }

    public void apagarMotor() {
        if (motorEncendido) {
            motorEncendido = false;
            System.out.println("El motor se ha apagado.");
        } else {
            System.out.println("El motor ya está apagado.");
        }
    }

    public void aumentarVelocidad() {
        if (motorEncendido) {
            velocidadActual += 10;
            System.out.println("El coche ha aumentado la velocidad. Velocidad actual: " + velocidadActual + " km/h.");
        } else {
            System.out.println("El motor está apagado. No se puede aumentar la velocidad.");
        }
    }

    public void reducirVelocidad() {
        if (velocidadActual > 0) {
            velocidadActual -= 10;
            System.out.println("El coche ha reducido la velocidad. Velocidad actual: " + velocidadActual + " km/h.");
        } else {
            System.out.println("El coche ya está detenido.");
        }
    }

    public void cambiarCarril(int nuevoCarril) {
        if (motorEncendido) {
            carrilActual = nuevoCarril;
            System.out.println("El coche ha cambiado al carril " + carrilActual + ".");
        } else {
            System.out.println("El motor está apagado. No se puede cambiar de carril.");
        }
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.iniciarMotor();
        miCoche.aumentarVelocidad();
        miCoche.cambiarCarril(2);
        miCoche.reducirVelocidad();
        miCoche.apagarMotor();
    }
}
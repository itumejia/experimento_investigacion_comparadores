import java.util.List;

public class Coche {
    private boolean encendido;
    private int velocidad;
    private int carril;

    public Coche() {
        encendido = false;
        velocidad = 0;
        carril = 1;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El coche se ha encendido.");
        } else {
            System.out.println("El coche ya está encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El coche se ha apagado.");
        } else {
            System.out.println("El coche ya está apagado.");
        }
    }

    public void acelerar() {
        if (encendido) {
            velocidad += 10;
            System.out.println("El coche ha acelerado. Velocidad actual: " + velocidad + " km/h.");
        } else {
            System.out.println("El coche está apagado. No se puede acelerar.");
        }
    }

    public void frenar() {
        if (velocidad > 0) {
            velocidad -= 10;
            System.out.println("El coche ha frenado. Velocidad actual: " + velocidad + " km/h.");
        } else {
            System.out.println("El coche ya está detenido.");
        }
    }

    public void cambiarCarril(int nuevoCarril) {
        if (encendido) {
            carril = nuevoCarril;
            System.out.println("El coche ha cambiado al carril " + carril + ".");
        } else {
            System.out.println("El coche está apagado. No se puede cambiar de carril.");
        }
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.encender();
        miCoche.acelerar();
        miCoche.cambiarCarril(2);
        miCoche.frenar();
        miCoche.apagar();
    }
}
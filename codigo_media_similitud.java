public class Avion {
    private boolean motorEncendido;
    private int altitud;
    private int velocidad;

    public Avion() {
        motorEncendido = false;
        altitud = 0;
        velocidad = 0;
    }

    public void encenderMotor() {
        if (!motorEncendido) {
            motorEncendido = true;
            System.out.println("El motor del avión se ha encendido.");
        } else {
            System.out.println("El motor del avión ya está encendido.");
        }
    }

    public void apagarMotor() {
        if (motorEncendido) {
            motorEncendido = false;
            System.out.println("El motor del avión se ha apagado.");
        } else {
            System.out.println("El motor del avión ya está apagado.");
        }
    }

    public void despegar() {
        if (motorEncendido) {
            if (altitud == 0) {
                altitud = 1000;
                velocidad = 200;
                System.out.println("El avión ha despegado. Altitud: " + altitud + " metros, Velocidad: " + velocidad + " km/h.");
            } else {
                System.out.println("El avión ya ha despegado.");
            }
        } else {
            System.out.println("El motor del avión está apagado. No se puede despegar.");
        }
    }

    public void aterrizar() {
        if (altitud > 0) {
            altitud = 0;
            velocidad = 0;
            System.out.println("El avión ha aterrizado. Altitud: " + altitud + " metros, Velocidad: " + velocidad + " km/h.");
        } else {
            System.out.println("El avión ya está en tierra.");
        }
    }

    public void aumentarAltitud(int incremento) {
        if (motorEncendido) {
            altitud += incremento;
            System.out.println("El avión ha aumentado su altitud. Altitud actual: " + altitud + " metros.");
        } else {
            System.out.println("El motor del avión está apagado. No se puede aumentar la altitud.");
        }
    }

    public void reducirAltitud(int decremento) {
        if (altitud > 0) {
            altitud -= decremento;
            System.out.println("El avión ha reducido su altitud. Altitud actual: " + altitud + " metros.");
        } else {
            System.out.println("El avión ya está en tierra.");
        }
    }

    public static void main(String[] args) {
        Avion miAvion = new Avion();
        miAvion.encenderMotor();
        miAvion.despegar();
        miAvion.aumentarAltitud(500);
        miAvion.reducirAltitud(200);
        miAvion.aterrizar();
        miAvion.apagarMotor();
    }
}
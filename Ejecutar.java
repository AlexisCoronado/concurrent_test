public class Ejecutar{
    public static void main(String[] args) {
        cuentaBancaria cuenta = new cuentaBancaria();
        //creaciono de los empleados accediendo a la cuenta
        Thread trabajador1 = new Thread(new trabajador(cuenta), "Tabajador 1");
        Thread trabajador2 = new Thread(new trabajador(cuenta), "Tabajador 2");

        //inciar los hilos
        trabajador1.start();
        trabajador2.start();
    }
}
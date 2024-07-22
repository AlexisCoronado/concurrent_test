import java.util.concurrent.atomic.AtomicInteger;
public class cuentaBancaria {
    //crear una instancia
    private AtomicInteger saldo = new AtomicInteger(1000);
    //se va aencargar de liberar cada proceso de cada hilo, el valor determina el tiempo logico, para que cada hilo tenga la tarea hecha
    //mil milisegundos es lo normal 1000, 3000. Depende del numero de nucleos

    //metodo para deposito
    public void deposito (double cantidad){
        saldo.getAndAdd((int) cantidad);//si hay algun proceso, se incrementa el tiempo
        System.out.println(Thread.currentThread().getName()+" deposito : " + cantidad);//ejemplo: adriana deposit: y la cantidad
        System.out.println(saldo);
        
    }

//metodo para retirar
    public void retirar(double cantidad){
        int saldoinicial,saldofinal;
        do { 
            saldoinicial=saldo.get();
            saldofinal=saldoinicial -(int) cantidad;
        } while (!saldo.compareAndSet(saldofinal, saldofinal));
        System.out.println(Thread.currentThread().getName() + " retiro: " + cantidad);
        System.out.println("Saldo Final: " + saldo);
        //realizar la operacion si el saldo no ha cambiado
    }
}
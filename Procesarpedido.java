import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
public class Procesarpedido {
    
    public static void main(String[] args) {
        BlockingQueue<Pedido> colaPedidos = new LinkedBlockingQueue<>();
//crear e iniciar empleados(hilos)        
Thread empleado1 = new Thread(new Empleado(colaPedidos),"Empleado 1");   
Thread empleado2 = new Thread(new Empleado(colaPedidos),"Empleado 2"); 
empleado1.start();
empleado2.start();
//crear y agregar pedidos a la cola
for (int i = 0; i < 10; i++) {
    Pedido pedido = new Pedido();
    try {
        colaPedidos.put(pedido);//agrego un pedido a la cola
        System.out.println(" Pedido creado: "+ pedido);
        Thread.sleep(500);//simula el tiempo de la creacion del pedido
    } catch (InterruptedException e) {
        System.out.println("El hilo pricipal fue intnerrumpido");
    }
}
    }

}

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Pedido {
    private static final AtomicInteger idGenerador = new AtomicInteger(0);
    private final int id;
    pubilc Pedido() {
        this.id=idGenerador.incrementAndGet();
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        //TODO AUTO-generated methosd stub
        return "Pedido #" + id;
    }
}


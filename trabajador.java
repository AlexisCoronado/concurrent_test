public class trabajador  implements Runnable{

    private cuentaBancaria cuenta;
    public trabajador(cuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        for (int i = 0; i < 3; i++) {
            double cantidad = Math.random()*1000;
            cuenta.deposito(cantidad);
            cuenta.retirar(cantidad);            
        }
    }


    
}

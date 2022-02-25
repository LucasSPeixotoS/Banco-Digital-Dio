package Classes;

public interface IterfaceConta {
    
    public void sacar(double valorSacar);
    
    public void depositar(double valorDepositar);

    public void transferir(double valorTrasnferir, IterfaceConta contaDestino);

    public void imprimirExtrato();

}

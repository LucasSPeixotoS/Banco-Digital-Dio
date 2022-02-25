package Classes;

public interface IterfaceConta {
    
    // Resumos do que podemos fazer na Conta
    
    public void sacar(double valorSacar);
    
    public void depositar(double valorDepositar);

    public void transferir(double valorTrasnferir, IterfaceConta contaDestino);

    public void imprimirExtrato();

}

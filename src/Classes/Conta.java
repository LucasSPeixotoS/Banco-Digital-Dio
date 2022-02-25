package Classes;

public abstract class Conta implements IterfaceConta{

        // Atributos da classe
        private static int SEQUENCIAL = 1;
        private static final int AGENCIA_PADRAO = 1;

        protected int agencia;
        protected int numero;
        protected double saldo;

        //Métodos da Classe
        public Conta() {
            this.agencia = AGENCIA_PADRAO;
            this.numero = SEQUENCIAL++;
        }
    
        //Métodos Abstratos da Interface
        public void sacar(double valorSacar) {
            this.saldo = saldo - valorSacar;
        }

        public void depositar(double valorDepositar) {
            this.saldo += valorDepositar;
        }

        public void transferir(double valorTrasnferir, IterfaceConta contaDestinoConta) {
            this.sacar(valorTrasnferir);
            contaDestinoConta.depositar(valorTrasnferir);
        }

        protected void imprimirInfosComum() {
            
            System.out.println(String.format("Agencia: %d", this.agencia));
            System.out.println(String.format("Numero: %d", this.numero));
            System.out.println(String.format("Saldo: %.2f", this.saldo));
        }
    
        
        // Gets
        public int getAgencia() {
            return agencia;
        }
    
        public int getNumero() {
            return numero;
        }
    
        public double getSaldo() {
            return saldo;
        }
    
}

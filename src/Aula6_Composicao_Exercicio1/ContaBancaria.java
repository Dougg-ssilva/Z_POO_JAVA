package Aula6_Composicao_Exercicio1;

public class ContaBancaria {

    //Atributos
	
	private float saldo, limite;
	private int numero, agencia;
	
	//Construtor

	public ContaBancaria() {}
	
	public ContaBancaria(int num, int ag) {
		this.numero = num;
		this.agencia = ag;
		this.saldo = 0;
		this.limite = 500;		
	}
	
	public ContaBancaria(int num, int ag, float lim) {
		this.numero = num;
		this.agencia = ag;
		this.saldo = 0;
		this.limite = lim;		
	}
	
	public ContaBancaria(int num, int ag, 
			             float saldo, float lim) {
		this.numero = num;
		this.agencia = ag;
		this.saldo = saldo;
		this.limite = lim;		
	}
	
	//M�todos
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float valor) {
		if (valor >= -limite) {
			saldo = valor;
		}
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public boolean sacar(float valor) {
		if (valor <= (saldo + limite)) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}
	
	public void depositar(float valor) {
		saldo = saldo + valor;		
	}
	
	public boolean transferir(float valor) {
		return sacar(valor);
	}
	
	public boolean pagar(float valor) {
		return sacar(valor);
	}
	
	public void imprimirExtrato() {		
		System.out.println("Ag: " + agencia + " Conta: " + numero);
		System.out.println("Saldo: R$" + saldo + " Limite: " + limite);
	}
	
	public void verificaOperacao(boolean result) {
		if (result == true)
			System.out.println("Operacao realizada com sucesso");
		else 
			System.out.println("Operacao falhou");		
	}	

}
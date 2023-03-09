package entities;

public class ContaBancaria {
	private int numeroConta;
	private String nomeTitular;
	private double valorConta;
	
	public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		realizarDeposito(depositoInicial);
	}
	
	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getValorConta() {
		return valorConta;
	}
	
	public void realizarSaque(double valor) {
		this.valorConta -= valor + 5;
	}
	
	public void realizarDeposito(double valor) {
		this.valorConta += valor;
	}

	@Override
	public String toString() {
		return "Dados da conta: Número da conta:" + numeroConta + ", Nome do titular:" + nomeTitular + ", Valor na conta: R$"
				+ valorConta;
	}
	
	
}

package pkg;

public class Cuenta {
	
	Double saldo;
	
	
	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public void ingresar(Double i) {
		
		this.saldo += i;
	}

	public void retirar(double d) {
		
		this.saldo -= d;
	}
	
}

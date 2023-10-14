package pkg;

public class Cuentas {
	double saldo; 
	String numero;
	String titular;
	double retirar;
	
	public Cuentas(String numero, String titular, double saldo) {
		super();
		this.saldo = saldo;
		this.numero=numero;
		this.titular=titular;
	}

	public double getSaldo() {
		return saldo;
		//return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double i) {
		
		this.setSaldo(this.getSaldo()+i);
	}


	public void retirar(int i) {
		/*if(i<=this.getSaldo()) {
		this.setSaldo(this.getSaldo()-i);
		
		
	}*/
		if(this.getSaldo()-i>-500) {
			this.setSaldo(this.getSaldo()-i);
			
		}else System.out.print("Error, n¡su saldo no puede ser menor de 500");
		
	}

}


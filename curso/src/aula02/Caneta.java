package aula02;
public class Caneta {
public String modelo;
public 	String cor;
private	float ponta;
protected	int carga;
private	boolean tampada;
	
	// metodo estatos que dira o estatus do objeto.
public	void status() {
		System.out.println("modelo: "+ this.modelo);
		System.out.println("uma caneta: " + this.cor);
		System.out.println("ponta: "+ this.cor);
		System.out.println("Carga: "+ this.carga);
		System.out.println("está tampada? "+ this.tampada);
			
		
	}// chama o metodo rabiscar 
public	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("erro! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
	}

public void tampar() {
	this.tampada =true;
	}	
public void destampar() {
	this.tampada=false;
}
}
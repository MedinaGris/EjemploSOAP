package ejemplo.model;

import java.io.Serializable;


public class Operacion implements Serializable {//se convierte objetos a bytes para que este pueda ser recuperado
	private static final long serialVersionUID=1L; //version del objeto serializable
	
	public static int total;
	public static int n1;
	public static int n2;
	
	
	public static int sumar() {
		total=n1+n2;
		return total;
	}


	public static int getTotal() {
		return total;
	}


	public static void setTotal(int total) {
		Operacion.total = total;
	}


	public static int getN1() {
		return n1;
	}


	public static void setN1(int n1) {
		Operacion.n1 = n1;
	}


	public static int getN2() {
		return n2;
	}


	public static void setN2(int n2) {
		Operacion.n2 = n2;
	}
	
	
	

}

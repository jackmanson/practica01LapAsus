package Principal;

	class NumeroRound {

	//Variable nativas
	private double num1 = 5.85;
	private float num2 = 11.56f;
	
	//construcctores
	public NumeroRound(double num1) {
		this.num1 = num1;
	}
		
	public NumeroRound(float num2) {
		this.num2 = num2;
	}
	
	//getter and setter
	public double getNum1() {
		return num1;
	}
	
	public void setNum1 (double num1) {
		this.num1 = num1;
	}
	
	public float getNum2() {
		return num2;
	}
	
	public void setNum2(float num2) {
		this.num2 =  num2;
	} 
	
	//metodos
	public String holaMundo() {
		return "Hola mundo.";
	}
	
	public void redondeoNum(double num1) {
		int numR = (int)Math.round(num1);
		System.out.println(numR+"\n");
	}
	
	public void redondeoNum(float num2) {
		int numR = (int)Math.round(num2);
		System.out.println(numR+"\n");
	}
	
}

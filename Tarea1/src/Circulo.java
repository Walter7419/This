

public class Circulo {
	public int ID;
	
	Circulo(){
		this(176770);
	}
	
	public Circulo(int ID) {
			this.ID = ID;
	}
	
	public double cPCi() {
		return(double) (2*3.14*ID);
	}
	

	
	public double cACi() {
		return (double) ID * ID * 3.14;
	}
	
	public double calDia() {
		return(double) Math.sqrt(2*(ID*ID));
}
	public int cPCu() {
		return ID*4;
}
	public int cACu() {
		return ID*ID;
} 	
}
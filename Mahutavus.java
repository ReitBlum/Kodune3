

public abstract class Mahutavus{
	int maxKogus;
	public Mahutavus(int uusKogus){
		maxKogus=uusKogus;
	}
	public abstract double kalad();
	public double arvuta(){
		return maxKogus-kalad();
		
		
	}
} 
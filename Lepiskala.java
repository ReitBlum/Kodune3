

public class Lepiskala extends Mahutavus{
	
	int koger, s2rg, linask;
	
	public Lepiskala(int koger, int s2rg, int linask, int suurus){
		super(suurus);
		this.koger=koger;
		this.s2rg=s2rg;
		this.linask=linask;
	}
	public double kalad(){
		return ((koger+s2rg+linask)*0.7)*0.4;
		
	}
} 
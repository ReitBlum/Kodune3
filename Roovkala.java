

public class Roovkala extends Mahutavus{
	int haug, ahven, koha;
	public Roovkala(int haug, int ahven, int koha, int suurus){
		super(suurus);
		this.haug=haug;
		this.ahven=ahven;
		this.koha=koha;
	}
	public double kalad(){
		return ((haug+ahven+koha)*0.7)*1.1;
		
	}
}
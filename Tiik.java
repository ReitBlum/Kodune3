

 import java.util.*;
public class Tiik{
		public static void main(String[] arg){
			Lepiskala v1=new Lepiskala(3000, 5000, 8000, 55000);
			
			
			Roovkala v2=new Roovkala(20000, 4000, 60000, 50000);
			
			
			List<Mahutavus> Liigitus=new ArrayList<Mahutavus>();
			Liigitus.add(v1);
			Liigitus.add(v2);
	
			
			for(Mahutavus k: Liigitus){
				System.out.println("Tiik mahutab:"+k.maxKogus);
			if(k.arvuta()>1){
				System.out.println("yritad lisada:"+k.kalad()+" yhikut kala. Paistab, et mahub");
				
			}
			else{
				System.out.println("yritad lisada:"+k.kalad()+" yhikut kala. Paistab, et ei mahu");
				
			}
			}
		
	}
}
package m02;

import java.util.ArrayList;

/**
 * This is my test file
 * 
 * @author tyler
 *
 */
public class Module02 {
	
	public static void main(String[] args) {
		
		PowerPlant myPowerPlant = new PowerPlant(100);
		
		WindFarm onShore = new WindFarm(6800, false);
		WindFarm offShore = new WindFarm(400, true);
		
		HydroPowerPlant withDam = new HydroPowerPlant(22500, true);
		HydroPowerPlant noDam = new HydroPowerPlant(15, false);

		
		ArrayList<PowerPlant> plants = new ArrayList<PowerPlant>();
		plants.add(myPowerPlant);
		plants.add(onShore);
		plants.add(offShore);
		plants.add(withDam);
		plants.add(noDam);
		
		
		for(PowerPlant el : plants){
			
			System.out.println(el.toString());	
			System.out.println(el.generateElectricity());
			System.out.println();
			
		}
	}

}

	
	



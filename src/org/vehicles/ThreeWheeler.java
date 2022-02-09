package org.vehicles;
import org.phone.Oppo;
import org.phone.Vivo;
public class ThreeWheeler extends Oppo {
	public void three() {
		System.out.println("Auto");}

	public static void main(String[] args) {
		ThreeWheeler t = new ThreeWheeler();
		t.three();
		t.redmiPhone();
		t.oppoPhone();
		
		Vivo v = new Vivo();
		v.vivoPhone();
		
		
	}

}

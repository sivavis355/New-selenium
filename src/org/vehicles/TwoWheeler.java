package org.vehicles;

import org.phone.Oppo;
import org.phone.Redmi;
import org.phone.Vivo;

public class TwoWheeler {
	public void two() {
		System.out.println("Bike");
	}
	public static void main(String[] args) {
		TwoWheeler t = new TwoWheeler();
		t.two();
		Vivo v = new Vivo();
		v.vivoPhone();
		Redmi r = new Redmi();
		r.redmiPhone();
		Oppo o = new Oppo();
		o.oppoPhone();
		
	}

}

package org.vehicles;
import org.phone.Oppo;
public class FourWheeler extends Oppo{
	
	public void four() {
		System.out.println("Car");
	}
	//Multi Level Inheritance
	public static void main(String[] args) {
		FourWheeler f = new FourWheeler();
		f.oppoPhone();
		f.redmiPhone();
		f.four();

	}

}

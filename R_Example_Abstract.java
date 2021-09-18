
/**
Example How Abstract Class Works
*/
import java.util.*;

abstract class Bank2 {
	/**
	 * A class containing an abstract method is an abstract class.
	 */
	abstract int interest(int amt);
}

class ICICIBank extends Bank2 {
	int interest(int amt) {
		int amt1;
		if (amt < 50000) {
			amt1 = (amt * 7 * 3) / 100;
		} else {
			amt1 = (amt * 10 * 3) / 100;
		}
		return amt1;
	}
}

class AxisBank extends Bank2 {
	int interest(int amt) {
		int amt1;
		if (amt < 45000) {
			amt1 = (amt * 5 * 3) / 100;
		} else {
			amt1 = (amt * 10 * 3) / 100;
		}
		return amt1;
	}
}

class SBIBank extends Bank2 {
	int interest(int amt) {
		int amt1;
		if (amt < 51000) {
			amt1 = (amt * 8 * 3) / 100;
		} else {
			amt1 = (amt * 10 * 3) / 100;
		}
		return amt1;
	}
}

class R_Example_Abstract {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int amt, amtsbi, amtaxis, amticici;
		System.out.println("Enter The Amount You Want to \"Deposit:\"");
		System.out.println("");
		amt = cin.nextInt();
		Bank2 i1 = new ICICIBank();
		amticici = i1.interest(amt);
		Bank2 i2 = new SBIBank();
		amtsbi = i2.interest(amt);
		Bank2 i3 = new AxisBank();
		amtaxis = i3.interest(amt);
		if (amtaxis > amtsbi) {
			if (amtaxis > amticici) {
				System.out.println("Axis Bank:" + amtaxis);
			} else {
				System.out.println("ICICI Bank:" + amticici);
			}
		} else {
			if (amtsbi > amticici) {
				System.out.println("SBI:" + amtsbi);
			} else {
				System.out.println("ICICI:" + amtsbi);
			}
		}
	}
}
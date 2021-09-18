class D_Conditionals {
	public static void main(String[] args) {
		int age = 25;
		if (age > 0) {
			if (age > 16) {
				System.out.println("Welcome!");
			} else if (age < 13) {
				System.out.println("Too Young");
			} else {
				System.out.println("Wait For Few Years");
			}
		} else {
			System.out.println("Error");
		}
		/******************************
		 * Logical Statements two=&& , ||
		 ***************************/
		age = 25;
		int money = 100;
		if (age > 18 || money > 500) {
			System.out.println("Welcome!");
		}
	}
}
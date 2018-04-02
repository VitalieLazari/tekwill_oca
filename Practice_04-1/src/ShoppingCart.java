public class ShoppingCart {
	
	public static void main (String [] args) {
	
	String custName = "Tommy Gun";
	String itemName = "Desert Eagle Cal. 50";
	
	System.out.println(custName + " wanna buy a new branded " + itemName);


	String [] array = new String[10];
	
	array[0] = "a";
	array[1] = "b";
	array[2] = "c";
	array[3] = "d";
	
	for (String string : array) {
		System.out.println(string);
	}
}
}
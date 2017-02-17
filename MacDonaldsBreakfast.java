package foods.breakfast;

import java.util.Random;

public class MacDonaldsBreakfast {
	public static void main(String[] args) {
		System.out.println("Buy the following and enjoy! (if possible)");
		System.out.println("I do not force you to buy anything in any way. This is just for fun. :D");
		System.out.println(" ");

		Random rand = new Random();
		int allFoods = rand.nextInt(13) + 1;
		int addOn = rand.nextInt(2) + 1;
		int Sides = rand.nextInt(2) + 1;
		int Drinks = rand.nextInt(2) + 1;

		switch (allFoods) {

		case 1:
			System.out.println("Big Breakfast!");
			break;

		case 2:
			System.out.println("Breakfast Deluxe!");
			break;

		case 3:
			System.out.println("Chicken Muffin!");
			break;

		case 4:
			System.out.println("Egg McMuffin!");
			break;

		case 5:
			System.out.println("Filet-O-Fish!");
			break;

		case 6:
			System.out.println("Hotcakes!");
			break;

		case 7:
			System.out.println("Sausage McMuffin!");
			break;

		case 8:
			System.out.println("Sunrise Roll! (Sausage)");
			break;

		case 9:
			System.out.println("Sunrise Roll! (Chicken Ham)");
			break;

		case 10:
			System.out.println("Breakfast Wrap! (Sausage)");
			break;

		case 11:
			System.out.println("Breakfast Wrap! (Chicken Ham)");
			break;

		case 12:
			System.out.println("Breakfast Wrap! (Chicken Bacon with Spinach)");
			break;

		case 13:
			System.out.println("BBQ Beef Burger with Egg!");
			break;
			
		default:
			System.err.println("Invalid case! You can report this to @PlantsCodes. D:");
			break;
		}
		System.out.println(" ");

		if (allFoods == 5) {
			if (addOn == 1) {
				System.out.println("Size: Single");
			} else if (addOn == 2) {
				System.out.println("Size: Double");
			}
		} else if (allFoods == 6) {
			if (addOn == 1) {
			} else if (addOn == 2) {
				System.out.println("(and with Sausage!)");
				System.out.println(" ");
			}
		} else if (addOn == 7) {
			if (addOn == 1) {
			} else if (addOn == 2) {
				System.out.println("(and with Egg!)");
				System.out.println(" ");
			}
		}

		System.out.println("Sides:");
		if (Sides == 1) {
			System.out.println("Hashbrowns!");
		} else if (Sides == 2) {
			System.out.println("Corn Cup!");
		}
		System.out.println(" ");

		System.out.println("Drinks:");
		if (Drinks == 1) {
			System.out.println("Iced MILO!");
		} else if (Drinks == 2) {
			System.out.println("100% Pure Orange Juice!");
		} else if (Drinks == 3) {
			System.out.println("Hot Tea!");
		} else if (Drinks == 4) {
			System.out.println("Cappucinno!");
		} else if (Drinks == 5) {
			System.out.println("Premium Roast Coffee!");
		} else if (Drinks == 6) {
			System.out.println("Latte!");
		}
	}
}

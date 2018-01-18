package foods.breakfast;

import java.util.Random;

public class MacDonaldsBreakfast {
	public static void main(String[] args) {
		System.out.println("Buy the following and enjoy! (if possible)");
		System.out.println("I do not force you to buy anything in any way. This is just for fun. :D");
		System.out.println(" ");
		
		Random rand = new Random();
		int mainFood = rand.nextInt(13) + 1;
		int Beverages = rand.nextInt(9) + 1;
		int Size = rand.nextInt(2) + 1;
		
		System.out.println("Main Course:");
		switch (mainFood) {
		
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
			System.out.println("Hotcakes with Sausage!");
			break;
			
		case 8:
			System.out.println("Sausage McMuffin with Egg!");
			break;
			
		case 9:
			System.out.println("Sausage McMuffin!");
			break;
			
		case 10:
			System.out.println("Sunrise Roll Sausage!");
			break;
			
		case 11:
			System.out.println("Sunrise Roll Chicken Ham!");
			break;
			
		case 12:
			System.out.println("Breakfast Wrap Sausage!");
			break;
			
		case 13:
			System.out.println("Breakfast Wrap Chicken Ham!");
			break;
<<<<<<< HEAD

		case 14:
			System.out.println("Hotcakes with Chicken Selects! (promotion)"); // promotion//
			break;

=======
			
>>>>>>> parent of 1ee2f63... Version 1.1 A Whole Clean State! :sparkles:
		default:
			System.err.println("Invalid case! You can report this to @PlantsCodes. D:");
			break;
		}
		System.out.println(" ");
		
		System.out.println("Drinks:");
		switch (Beverages) {
		
		case 1:
		case 2:
			System.out.println("100% Pure Orange Juice!");
			break;
			
		case 3:
			System.out.println("Hot MILO!");
			break;
			
		case 4:
			System.out.println("Hot Tea!");
			break;
			
		case 5:
		case 6:
			System.out.println("Iced MILO!");
			break;
			
		case 7:
			System.out.println("McCaf\u00E9 Cappuccino!");
			break;
			
		case 8:
			System.out.println("McCaf\u00E9 Premium Roast Coffee!");
			break;
			
		case 9:
			System.out.println("McCaf\u00E9 Latte!");
			break;
			
		default:
			System.err.println("Invalid case! You can report this to @PlantsCodes. D:");
			break;
		}
		if (mainFood == 5) {
			System.out.println(" ");
			System.out.println("Size:");
			if (Size == 1) {
				System.out.println("Single!");
			} else if (Size == 2) {
				System.out.println("Double!");
			}
		}
	}
}
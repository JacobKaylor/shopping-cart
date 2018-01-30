import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cart myGroceries = new Cart();
		
		for(int i = 0; i >=0;i++) {
			
			System.out.println("please enter the name of the item: ");
			String addItem = input.next();
			System.out.println("please enter the unit price: ");
			double addPrice = input.nextDouble();
			System.out.println("please enter the quantity: ");
			int addQuantity = input.nextInt();
			
			myGroceries.addGrocery(new Item(addItem,addPrice,addQuantity));
			myGroceries.showOrder();
			System.out.println("Current Price:$"+myGroceries.getTotalPriceOfItems());
			System.out.println("\n Would you like to continue shopping(y or n)?");
			String option2 = input.next();
			
			if(option2.toLowerCase().equals("n")) {
				break;
			}else {
				continue;
			}
			
		}
		myGroceries.showOrder();
		System.out.println("Total Price:$"+myGroceries.getTotalPriceOfItems());
		input.close();

	}

}

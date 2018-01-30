import java.util.ArrayList;
import java.util.List;



public class Cart {
	private List<Item> ingredients = new ArrayList<>();

	public void addGrocery(Item nextItem) {
		ingredients.add(nextItem);
	}

	public int numItems() {
		return ingredients.size();
	}

	public double getTotalPriceOfItems() {
		double total = 0;
		for(Item ingredient: ingredients) {
			total += (ingredient.getPrice()*ingredient.getQuantity());
		}
		return total;
	}
	
	public void showOrder() {
		for(Item ingredient: ingredients) {
			System.out.println("Item: "+ ingredient.getName()+
			"\t Price: $"+ ingredient.getPrice()+"\t Quantity: "+ ingredient.getQuantity());
	}
		
	}
}


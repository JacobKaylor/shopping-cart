import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CartTest {

	@Test
	public void shouldInitiateCart() {
		Cart underTest = new Cart();
		assertNotNull(underTest);
	}
	@Test
	public void shouldAddIngredient() {
		Cart underTest = new Cart();
		underTest.addGrocery(new Item("",0.0,0));
		int check = underTest.numItems();
		assertEquals(1,check);
	}
	@Test
	public void shouldAdd2Ingredients() {
		Cart underTest = new Cart();
		underTest.addGrocery(new Item("",0.0,0));
		underTest.addGrocery(new Item("",0.0,0));
		int check = underTest.numItems();
		assertEquals(2,check);
	}
	@Test
	public void shouldGetPriceOfIngredient() {
		Cart underTest = new Cart();
		underTest.addGrocery(new Item("",10.05,0));
		double check = underTest.getTotalPriceOfItems();
		assertEquals(10.05,check, .001);
	}
	@Test
	public void shouldGetTotalPriceOfIngredients() {
		Cart underTest = new Cart();
		underTest.addGrocery(new Item("",10.05,0));
		underTest.addGrocery(new Item("",10.05,0));
		double check = underTest.getTotalPriceOfItems();
		assertEquals(20.10,check, .001);
	}
	

}

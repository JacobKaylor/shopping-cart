import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {
	@Test 
	public void shouldInitiateAnItemObject() {
		Item underTest = new Item();
		
		assertNotNull(underTest);
	}
	@Test
	public void shouldInitiateAnItemObjectWithNamePriceQuantity() {
		Item underTest = new Item("", 0.0, 0);
		assertNotNull(underTest);
	}
	@Test
	public void shouldReturnNameAsMilk() {
		Item underTest = new Item("Milk", 0.0,0); 
		String check = underTest.getName();
		assertEquals("Milk", check);
		}
	@Test
	public void shouldReturnNameAsEggs() {
		Item underTest = new Item("Eggs", 0.0,0); 
		String check = underTest.getName();
		assertEquals("Eggs", check);
	}
	@Test
	public void shouldReturnPriceAsDouble() {
		Item underTest = new Item("", 5.0,0);
		double check = underTest.getPrice();
		assertEquals(5.0, check, .001);
	}
	@Test
	public void shouldReturnPriceAs2() {
		Item underTest = new Item("", 2.0,0);
		double check = underTest.getPrice();
		assertEquals(2.0, check, .001);
	}
	@Test
	public void shouldReturnQuantityAs1() {
		Item underTest = new Item("",0.0,1);
		int check = underTest.getQuantity();
		assertEquals(1, check);
	}
	@Test
	public void shouldReturnQuantityAs2() {
		Item underTest = new Item("",0.0,2);
		int check = underTest.getQuantity();
		assertEquals(2, check);
	}
	
	
	
	
	
	}



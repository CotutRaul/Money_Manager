package Testing;


import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import program.*;


class Tests {
	@BeforeEach                                         
    void setUp() {
		Main.main(null);	
    }
	/**
	 * Test adding from a file
	 */
	@Test
	void testListFromFile() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),2, "Motorina", -300.0));
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		test.add(new Money(test.size(),15, "Casa", 300.0));
		test.add(new Money(test.size(),20, "Mancare", -100.0));
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect list from file");
	}
	/**
	 * Test sorting by date ascending
	 */
	@Test
	void testSortByDateASC() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),2, "Motorina", -300.0));
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		test.add(new Money(test.size(),15, "Casa", 300.0));
		test.add(new Money(test.size(),20, "Mancare", -100.0));
		MoneyPanel.sortByDate(1);
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect SortByDateASC");
	}
	/**
	 * Test sorting by date ascending after deleting and adding elements
	 */
	@Test
	void testSortByDateAfterAddAndDeleteASC() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		test.add(new Money(test.size(),5, "Cadou", -50.0));
		test.add(new Money(test.size(),15, "Casa", 300.0));
		test.add(new Money(test.size(),20, "Mancare", -100.0));
		test.add(new Money(test.size(),30, "Tigari", -20.0));
		
		MoneyPanel.addOneMoney(30, "Tigari", -20.0);
		MoneyPanel.addOneMoney(5, "Cadou", -50.0);		
		MoneyPanel.deleteOneMoney(0);
		MoneyPanel.sortByDate(1);
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect testSortByDateAfterAddAndDeleteASC");
	}
	/**
	 * Test sorting by date descending
	 */
	@Test
	void testSortByDateDES() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),20, "Mancare", -100.0));
		test.add(new Money(test.size(),15, "Casa", 300.0));
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		test.add(new Money(test.size(),2, "Motorina", -300.0));
		MoneyPanel.sortByDate(2);
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect SortByDateDES");
	}
	/**
	 * Test sorting by date descending after deleting and adding elements
	 */
	@Test
	void testSortByDateAfterAddAndDeleteDES() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),30, "Tigari", -20.0));
		test.add(new Money(test.size(),20, "Mancare", -100.0));
		test.add(new Money(test.size(),15, "Casa", 300.0));
		test.add(new Money(test.size(),5, "Cadou", -50.0));
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		
		MoneyPanel.addOneMoney(30, "Tigari", -20.0);
		MoneyPanel.addOneMoney(5, "Cadou", -50.0);		
		MoneyPanel.deleteOneMoney(0);
		MoneyPanel.sortByDate(2);
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect SortByDateDES");
	}
	/**
	 * Test sorting by name ascending
	 * */
	@Test
	void testSortByNameASC() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),15, "Casa", 300.0));
		test.add(new Money(test.size(),20, "Mancare", -100.0));
		test.add(new Money(test.size(),2, "Motorina", -300.0));
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		MoneyPanel.sortByName(1);
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect SortByNameASC");
	}
	/**
	 * Test sorting by name ascending after deleting and adding elements
	 */
	@Test
	void testSortByNameAfterAddAndDeleteASC() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),15, "Casa", 300.0));
		test.add(new Money(test.size(),20, "Mancare", -100.0));
		test.add(new Money(test.size(),2, "Motorina", -300.0));
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		test.add(new Money(test.size(),30, "Tigari", -20.0));

		MoneyPanel.addOneMoney(30, "Tigari", -20.0);
		MoneyPanel.addOneMoney(5, "Cadou", -50.0);		
		MoneyPanel.deleteOneMoney(2);
		MoneyPanel.sortByName(1);
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect SortByNameASC");
	}
	/**
	 * Test sorting by name descending
	 */
	@Test
	void testSortByNameDES() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		test.add(new Money(test.size(),2, "Motorina", -300.0));
		test.add(new Money(test.size(),20, "Mancare", -100.0));
		test.add(new Money(test.size(),15, "Casa", 300.0));
		MoneyPanel.sortByName(2);
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect SortByNameDES");
	}
	/**
	 * Test sorting by name descending after deleting and adding elements
	 */
	@Test
	void testSortByNameAfterAddAndDeleteDES() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),30, "Tigari", -20.0));
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		test.add(new Money(test.size(),2, "Motorina", -300.0));
		test.add(new Money(test.size(),15, "Casa", 300.0));
		test.add(new Money(test.size(),5, "Cadou", -50.0));
				
		MoneyPanel.addOneMoney(30, "Tigari", -20.0);
		MoneyPanel.addOneMoney(5, "Cadou", -50.0);		
		MoneyPanel.deleteOneMoney(4);
		MoneyPanel.sortByName(2);
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect SortByNameDES");
	}
	/**
	 * Test sorting by price ascending
	 */
	@Test
	void testSortByPriceASC() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		test.add(new Money(test.size(),15, "Casa", 300.0));
		test.add(new Money(test.size(),20, "Mancare", -100.0));
		test.add(new Money(test.size(),2, "Motorina", -300.0));
		MoneyPanel.sortByPrice(1);
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect SortByPriceASC");
	}
	/**
	 * Test sorting by price ascending after deleting and adding elements
	 */
	@Test
	void testSortByPriceAfterAddAndDeleteASC() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		test.add(new Money(test.size(),15, "Casa", 300.0));
		test.add(new Money(test.size(),5, "Cadou", -50.0));
		test.add(new Money(test.size(),20, "Mancare", -100.0));
		
		MoneyPanel.addOneMoney(30, "Tigari", -20.0);
		MoneyPanel.addOneMoney(5, "Cadou", -50.0);		
		MoneyPanel.deleteOneMoney(0);
		MoneyPanel.deleteOneMoney(4);
		MoneyPanel.sortByPrice(1);
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect SortByPriceASC");
	}
	/**
	 * Test sorting by price descending after deleting and adding elements
	 */
	@Test
	void testSortByPriceAfterAddAndDeleteDES() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),27, "Facturi", -412.4));
		test.add(new Money(test.size(),2, "Motorina", -300.0));
		test.add(new Money(test.size(),10, "Decoratiuni", -150.5));
		test.add(new Money(test.size(),20, "Mancare", -100.0));
		test.add(new Money(test.size(),5, "Cadou", -50.0));
		test.add(new Money(test.size(),30, "Tigari", -20.0));
		test.add(new Money(test.size(),15, "Casa", 300.0));
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		
		MoneyPanel.addOneMoney(30, "Tigari", -20.0);
		MoneyPanel.addOneMoney(5, "Cadou", -50.0);		
		MoneyPanel.addOneMoney(10, "Decoratiuni", -150.5);		
		MoneyPanel.addOneMoney(27, "Facturi", -412.4);		
		MoneyPanel.sortByPrice(2);
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect SortByPriceDES");
	}
	/**
	 * Test adding one element
	 */
	@Test
	void testAdd() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),2, "Motorina", -300.0));
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		test.add(new Money(test.size(),15, "Casa", 300.0));
		test.add(new Money(test.size(),20, "Mancare", -100.0));
		test.add(new Money(test.size(),30, "Tigari", -20.0));
		MoneyPanel.addOneMoney(30, "Tigari", -20.0);
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect Add");
	}
	/**
	 * Test adding multiple elements
	 */
	@Test
	void testMutipleAdd() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),2, "Motorina", -300.0));
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		test.add(new Money(test.size(),5, "Cadou", -50.0));
		test.add(new Money(test.size(),15, "Casa", 300.0));
		test.add(new Money(test.size(),18, "Facturi", -100.0));
		test.add(new Money(test.size(),20, "Mancare", -100.0));
		test.add(new Money(test.size(),30, "Tigari", -20.0));
		MoneyPanel.addOneMoney(30, "Tigari", -20.0);
		MoneyPanel.addOneMoney(5, "Cadou", -50.0);		
		MoneyPanel.addOneMoney(18, "Facturi", -100.0);
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect MutipleAdd");
	}
	/**
	 * Test deleting one element
	 */
	@Test
	void testDeleteOne() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),2, "Motorina", -300.0));
		test.add(new Money(test.size(),3, "Salar", 1400.0));
		test.add(new Money(test.size(),15, "Casa", 300.0));
		
		MoneyPanel.deleteOneMoney(3);;
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect DeleteOne");
	}
	/**
	 * Test deleting multiple elements
	 */
	@Test
	void testMutipleDelete() {
		List <Money> test = new ArrayList<Money>();
		test.add(new Money(test.size(),15, "Casa", 300.0));
		
		MoneyPanel.deleteOneMoney(3);
		MoneyPanel.deleteOneMoney(0);
		MoneyPanel.deleteOneMoney(0);
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect MutipleDelete");
	}
	/**
	 * Test deleting all elements
	 */
	@Test
	void testDeleteAll() {
		List <Money> test = new ArrayList<Money>();
		MoneyPanel.deleteAllMoney();
		assertEquals(test.toString(), MoneyPanel.moneyList.toString(), "Incorrect MutipleDelete");
	}
	/**
	 * Test Balance Income
	 */
	@Test
	void testBalanceIncome() {	
		BalancePanel.updateData();
		assertEquals("1700.0", BalancePanel.labelIncomeValue.getText() , "Incorrect BalanceIncome");
	}
	/**
	 * Test Balance Income after adding one element
	 */
	@Test
	void testBalanceIncomeAfterAdd() {
		MoneyPanel.addOneMoney(18, "Cadou", 100.0);
		BalancePanel.updateData();
		assertEquals("1800.0", BalancePanel.labelIncomeValue.getText() , "Incorrect BalanceIncomeAfterAdd");
	}
	/**
	 * Test Balance Income after adding multiple elements
	 */
	@Test
	void testBalanceIncomeAfterMixedAdd() {
		MoneyPanel.addOneMoney(18, "Cadou", 100.0);
		MoneyPanel.addOneMoney(20, "Facturi", -500.0);
		MoneyPanel.addOneMoney(22, "Decoratiuni", -200.0);
		MoneyPanel.addOneMoney(25, "Loterie", 1000.0);
		BalancePanel.updateData();
		assertEquals("2800.0", BalancePanel.labelIncomeValue.getText() , "Incorrect BalanceIncomeAfterMixedAdd");
	}
	/**
	 * Test Balance Expenses
	 */
	@Test
	void testBalanceExpenses() {
		BalancePanel.updateData();
		assertEquals("-400.0", BalancePanel.labelExpensesValue.getText() , "Incorrect BalanceExpenses");
	}
	/**
	 * Test Balance Expenses after adding one element
	 */
	@Test
	void testBalanceExpensesAfterAdd() {
		MoneyPanel.addOneMoney(18, "Cadou", -100.0);
		BalancePanel.updateData();
		assertEquals("-500.0", BalancePanel.labelExpensesValue.getText() , "Incorrect BalanceExpensesAfterAdd");
	}
	/**
	 * Test Balance Expenses after adding multiple elements
	 */
	@Test
	void testBalanceExpensesAfterMixedAdd() {
		MoneyPanel.addOneMoney(18, "Cadou", 100.0);
		MoneyPanel.addOneMoney(20, "Facturi", -500.0);
		MoneyPanel.addOneMoney(22, "Decoratiuni", -200.0);
		MoneyPanel.addOneMoney(25, "Loterie", 1000.0);
		BalancePanel.updateData();
		assertEquals("-1100.0", BalancePanel.labelExpensesValue.getText() , "Incorrect BalanceExpensesAfterMixedAdd");
	}
	/**
	 * Test Balance Balance
	 */
	@Test
	void testBalanceBalance() {
		BalancePanel.updateData();
		assertEquals("1300.0", BalancePanel.labelBalanceValue.getText() , "Incorrect BalanceBalance");
	}
	/**
	 * Test Balance Balance after adding one element
	 */
	@Test
	void testBalanceBalanceAfterAdd() {
		MoneyPanel.addOneMoney(18, "Cadou", -100.0);
		BalancePanel.updateData();
		assertEquals("1200.0", BalancePanel.labelBalanceValue.getText() , "Incorrect BalanceBalanceAfterAdd");
	}
	/**
	 * Test Balance Balance after adding multiple elements
	 */
	@Test
	void testBalanceBalanceAfterMixedAdd() {
		MoneyPanel.addOneMoney(18, "Cadou", 100.0);
		MoneyPanel.addOneMoney(20, "Facturi", -500.0);
		MoneyPanel.addOneMoney(22, "Decoratiuni", -200.0);
		MoneyPanel.addOneMoney(25, "Loterie", 1000.0);
		BalancePanel.updateData();
		assertEquals("1700.0", BalancePanel.labelBalanceValue.getText() , "Incorrect BalanceBalanceAfterMixedAdd");
	}

}

package map;

import java.util.ArrayList;

public class ListOfList {

	public static void main(String[] args) {
		ArrayList<String> bakeryList = new ArrayList<>();
		bakeryList.add("pasta");
		bakeryList.add("Bread");
		bakeryList.add("croissant");

		System.out.println(bakeryList.get(0));

		ArrayList<String> drinkList = new ArrayList<>();
		drinkList.add("coke");
		drinkList.add("water");
		drinkList.add("soda");

		for (String product : drinkList) {
			System.out.print(product + " ");
		}
		
		System.out.println("\n>>>>><<<<<");

		ArrayList<String> produceList = new ArrayList<>();
		produceList.add("zuchini");
		produceList.add("onion");
		produceList.add("tomato");
		System.out.println(produceList);

		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
		groceryList.add(bakeryList);
		groceryList.add(drinkList);
		groceryList.add(produceList);
		System.out.println(groceryList.get(0));
		
		System.out.println("???????");
		for(ArrayList<String> test : groceryList) {
			System.out.print(test.get(0) + " ");

		}
		
		System.out.println("\n/////////");
		System.out.println(groceryList.get(2).get(0));

		System.out.println("===========");

		for (ArrayList<String> firstItem : groceryList) {
			System.out.println(firstItem);
		}

		System.out.println("###########");
		for (ArrayList<String> onlyFirstItem : groceryList) {
			System.out.println(onlyFirstItem.get(1));
		}

		System.out.println("************");
		for (ArrayList<String> twoItemList : groceryList) {
			System.out.println(String.format("%-8s: %-4s", twoItemList.get(0), twoItemList.get(2)));
		}

	}

}

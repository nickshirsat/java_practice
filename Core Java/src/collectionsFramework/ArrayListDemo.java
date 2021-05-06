package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("banana");
		list.add("Dragon Fruit");
		list.add("Papaya");
		
		//print entire list
		System.out.println(list);
		System.out.println();
		
		//basic for loop
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//ForEach loop
		for(String l : list) {
			System.out.println(l);
		}
		
		//Iterator loop
		System.out.println("\nIterator");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//CRUD on ArrayList
		System.out.println();
		
		//Create
		System.out.println(list);
		list.add("Grapes");
		list.add(2, "3rd fruit");
		
		//Update
		list.set(2, "Pear");
		System.out.println(list);
		list.set(list.indexOf("Pear"), "BlueBerry");
		System.out.println(list);
		
		//Delete
		list.remove("Grapes");
		System.out.println(list);
		
		//Read
		System.out.println("~~~~~~Reading~~~~~~");
		try {
			//Present in list
			System.out.println(list.get(list.indexOf("Mango")));
			//Not Present in list
			System.out.println(list.get(list.indexOf("Mango1")));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Element not Found in list");
		}
		System.out.println();
		
		//Operations
		//sorting the list
		Collections.sort(list);
		System.out.println(list);
		
		//Reverse the list
		Collections.reverse(list);
		System.out.println(list);
		
	}
}

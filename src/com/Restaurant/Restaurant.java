
package com.Restaurant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Restaurant {   		//Class Name Restaurant 

	static ArrayList<MenuItems> menulist = new ArrayList<MenuItems>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Restaurant Program");
		System.out.println("Welcome to the Resturant.");

		int ch = 0;
		while (ch != 5) {
			System.out.println("Options:");
			System.out.println("1.Add Menu \n2.Remove Menu \n3.Display Menus \n4.Search Menu \n5.Exit");

			System.out.println("Enter Your Choice : ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				addMenus();
				break;

			case 2:
				removeMenus();
				break;

			case 3:
				displayMenus();
				break;

			case 4:
				searchMenus();
				break;
			}
		}
	}

	// Adding the Menu in to the Restaurant Menu List
	public static void addMenus() {
		System.out.println("Add Menu:-");
		Scanner sc = new Scanner(System.in);
		System.out.println("Adding Menu in to the Menu list.");

		System.out.println("Enter the number of Menus you want to add: ");
		int size = sc.nextInt();

		System.out.println();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the Menu Id : ");
			int menuId = sc.nextInt();

			System.out.println("Enter the Menu Name : ");
			String menuName = sc.next();

			System.out.println("Enter the Menu Price : ");
			int price = sc.nextInt();

			MenuItems n = new MenuItems(menuId, menuName, price);
			menulist.add(n);
		}
	}

	// Remove Menu From the Restaurant Menus List using Menu id.
	public static void removeMenus() {
		System.out.println("Remove Menu:- ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Removing Menu item From Menu List: ");
		System.out.println("Enter the Menu id");
		int num = sc.nextInt();

		for (MenuItems i : menulist) {
			if (num == i.getMenuId()) {
				menulist.remove(i);
			}
			System.out.println("Removed the Menu from the Menus list");
		}
	}

	// Displaying the Menu Items Details List
	public static void displayMenus() {
		System.out.println("Display Menu List:- ");
		System.out.println("Restaurant Menu Items list: ");
		System.out.println();
		for (MenuItems i : menulist) {
			System.out.println(
					"Menu Id : " + i.getMenuId() + "\nMenu Name : " + i.getMenuName() + "\nPrice: " + i.getPrice());
		}
	}

	// Searching Menu From the Restaurant Menu List
	public static void searchMenus() {
		System.out.println("Search Menu:- ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Searching Menu from the Menu List Using Menu Id.");

		System.out.println("Enter the Menu id: ");
		int num = sc.nextInt();

		Iterator<MenuItems> iterator = menulist.listIterator();
		while (iterator.hasNext()) {
			MenuItems n = iterator.next();

			if (num == n.getMenuId()) {
				System.out.println("Menu is available.");
				break;
			} else {
				System.out.println("Menu is not available.");
			}

		}

	}

}
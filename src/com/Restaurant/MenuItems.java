//Restaurant Program

package com.Restaurant;			//Package Name - com.Restaurant

public class MenuItems {    // Class Name - MenuItems
	int menuId;
    String menuName;		
    int price;

    public MenuItems(int menuId, String menuName, int price) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.price = price;
    }

    public String toString() {
        return this.menuId + "," + this.menuName + " ," + this.price;
    }
    
    //getter setter Method
	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    
}

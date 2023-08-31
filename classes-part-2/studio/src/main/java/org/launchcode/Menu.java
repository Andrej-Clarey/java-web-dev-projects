package org.launchcode;
import java.util.Date;
import java.util.ArrayList;


public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "lastUpdated=" + lastUpdated +
                ", items=" + items +
                '}';
    }
    public void removeItem(MenuItem newItem){
        this.items.remove(newItem);
    }
    public void addItem(MenuItem newItem){
        this.items.add(newItem);
        this.lastUpdated = new Date();
    }
}



package collections;

import java.util.ArrayList;

/**
 * Created by dev on 23/08/15.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();


    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    public String findItem(String searchItem){
        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        return groceryList.get(position);
    }
    public static void main(String args[]){
        GroceryList gst = new GroceryList();
        gst.addGroceryItem("sugar");
        gst.addGroceryItem("sugar");
        gst.addGroceryItem("sugar");
        gst.addGroceryItem("sugar");
        System.out.println(gst.groceryList);

    }
}

// first _ _ _ _ _ _ last
// list.add(postion, element) void
// list.addFirst() void
// list.addLast() void
//clear() void
// clone() object
// get(index) return object
// getFirst() return object
// getLast()  return object
//poll() remove() This method retrieves and removes the head of the queue represented by this deque, or returns null if this deque is empty.
//pollFirst() removeFirst()
//pollLast()  removeLast()
//size() int
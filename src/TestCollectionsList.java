import java.util.Iterator;
import java.util.*;

public class TestCollectionsList {
    public static void main(String args[]){
        ArrayList<String> list1=new ArrayList<>();//Creating arraylist
        list1.add("Ravi");//Adding object in arraylist
        list1.add("Vijay");
        list1.add("Ravi");
        list1.add("Ajay");
        //Traversing list through Iterator
//        Iterator itr=list.iterator();
        /*while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
        for (Object name: list1
             ) {

            System.out.println(name);
        }

        System.out.println();
    }
}


// https://www.javatpoint.com

// methods add, addAll, remove, removeAll,  list1.addAll(list2), list1.retainAll(list2)( removes all elements except in retainAll method), .get(index), .set(index)
// Iterator itr = list.iterator(); itr.hasNext, itr.hasPrevious

//    boolean hasNext()	This method return true if the list iterator has more elements when traversing the list in the forward direction.
//        Object next()	This method return the next element in the list and advances the cursor position.
//        boolean hasPrevious()	This method return true if this list iterator has more elements when traversing the list in the reverse direction.
//        Object previous()	This method return the previous element in the list and moves the cursor position backwards.

//    void add(int index, Object element)
//        boolean addAll(Collection c)
//        void clear()
//        int lastIndexOf(Object o)
//        Object[] toArray()
//        Object[] toArray(Object[] a)
//        boolean add(Object o)	It is used to append the specified element to the end of a list.
//        boolean addAll(int index, Collection c)	It is used to insert all of the elements in the specified collection into this list, starting at the specified position.
//        Object clone()	It is used to return a shallow copy of an ArrayList.
//        int indexOf(Object o)	It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
//        void trimToSize()	It is used to trim the capacity of this ArrayList instance to be the list's current size.

//

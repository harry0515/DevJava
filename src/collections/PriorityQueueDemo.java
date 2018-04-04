package collections;

import java.util.*;

public class PriorityQueueDemo {
   public static void main(String args[]) {
   // create priority queue
   PriorityQueue < Integer >  prq = new PriorityQueue < Integer > (); 
       
   // insert values in the queue
   prq.add(6);  
   prq.add(9);
   prq.add(5);
   prq.add(64);
   prq.add(6);
      
   System.out.println ( "Priority queue values are: "+ prq);
      
   // create comparator
   Comparator comp = prq.comparator();

   System.out.println ( "Comparator value is: "+ comp);
   }
}




//     tail _ _ _ _ _ _ _ _ Head
//  add() at tail  (boolean)
// clear()\
// contains() boolean
// Iterator() starts from head
// comparator() This method returns the comparator used to order the elements in this queue, or null if this queue is sorted according to the natural ordering of its elements.
// peek() This method retrieves, but does not remove, the head of the queue represented by this deque, or returns null if this deque is empty.
//poll() remove() This method retrieves and removes the head of the queue represented by this deque, or returns null if this deque is empty.
//size() int
// toArray() arrayobject.
package collections;

import java.util.*;

public class ArrayDequeDemo {
   public static void main(String args[]) {
   // create priority queue
      ArrayDeque<Integer> deque = new ArrayDeque<Integer>(5);
      deque.add(25);
      deque.add(30);
      deque.add(35);
      for (Integer number : deque) {
         System.out.println("Number = " + number);
      }
      System.out.println("printing elements using iterator:");

      for(Iterator itr = deque.iterator();itr.hasNext();)  {
         System.out.println(itr.next());
      }

      //descendingIterator() is used to print the elements in reverse order
      //next() returns the next element on each iteration
      System.out.println("printing elements in reverse order:");

      for(Iterator descItr = deque.descendingIterator();descItr.hasNext();) {
         System.out.println(descItr.next());
      }

   }
}

//     tail _ _ _ _ _ _ _ _ Head
//  add() at tail  (boolean)
// addFirst()  at head  (void)
// addlast()  at tail  (void)
// clear()\
// contains() boolean
//clone() (dequecopy)
// Iterator() starts from head
// desecending.Iterator() starts from tail.
// getFirst() This method retrieves, but does not remove, the first element of this deque.(return element)
// getLast() This method retrieves, but does not remove, the last element of this deque.(return element)
// isEmpty() boolean
// peek() This method retrieves, but does not remove, the head of the queue represented by this deque, or returns null if this deque is empty.
//peekFirst() head
//peekLast() tail
//poll() remove() This method retrieves and removes the head of the queue represented by this deque, or returns null if this deque is empty.
//pollFirst() removeFirst()
//pollLast()  removeLast()
//size() int
// toArray() arrayobject.


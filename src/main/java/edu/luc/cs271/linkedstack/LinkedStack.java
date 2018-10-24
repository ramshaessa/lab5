package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> { //cannot violate the contact. These are the only methods in the interface. The language will enforce them more strongly. 

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor? 
  
  private int size;

  @Override
  public E push(final E obj) { //data being send/passed. //adding an element (can use addFirst)
      // TODO
    Node <E> newNode = new Node <E>(obj, top); //What is the box //creating new node obj does get pass into a new node. The new node is now the top of the stack. It has the data that I wanted and its next node is currently at the top. 
    top = newNode;
    size ++;
    temp = temp.next;//Head needs to connect to the newNode
    return obj; //returns data that I have passed in. 
    //
 
  }

  @Override
  public E peek() { //view the element but it does not remove. It returns what the value
    // TODO
    if(isEmpty())  {throw new NoSuchElementException();} 
    else {
    return top.data; //return the data of the recently inserted element 
  }
}
  @Override
  public E pop() { //removing an element (can use deletefirst)
    // TODO
    if (isEmpty()){
        throw new NoSuchElementException();
    }else{
        E result = top.data; // returning what was removed// assigning return type to the first element in the linked list
        top = top.next;
        size --;
        temp = temp.next;//Now the top of the stack is what the next element. Removing the top node.  initializes top as the next node in linked list 
        return result; // return result
    }

    
}




  @Override
  public boolean isEmpty() {
    // TODO 
    return(head == null); //change from return false; to return true; because the professor changed it.
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size (create arraylist that has right capacity for the current stack)
    //create new arraylist 
    List<E> list = new ArrayList<>(size);
    Node<E> temp = top;

    //LinkedStack<> myStack = new LinkedStack(size);
    while (temp != null) {
        
        list.add(temp.data);
        temp = temp.next; 
    
    
    
     
       
}
        return list;

    // TODO add any instance variable(s) required to support this (add another field to address this TODO item)
    //creating new list
  }
}

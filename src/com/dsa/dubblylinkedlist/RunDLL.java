package com.dsa.dubblylinkedlist;

public class RunDLL {

  public static void main(String[] args) {
    DubblyLinkedList dubblyLinkedList = new DubblyLinkedList(4);
    System.out.println("Head -> " + dubblyLinkedList.head.data);
    System.out.println("Tail -> " + dubblyLinkedList.tail.data);
    dubblyLinkedList.append(6);
    dubblyLinkedList.printList();
    System.out.println("Head -> " + dubblyLinkedList.head.data);
    System.out.println("Tail -> " + dubblyLinkedList.tail.data);
  }

}

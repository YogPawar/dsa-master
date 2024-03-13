package com.dsa.linkedlist;

import java.util.SortedMap;

public class RunLL {

  public static void main(String[] args) {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    singlyLinkedList.create(5);
    singlyLinkedList.append(10);
    singlyLinkedList.append(11);
    singlyLinkedList.append(41);
    singlyLinkedList.append(61);
    singlyLinkedList.append(81);
    System.out.println(singlyLinkedList.tail.value);

    System.out.println(singlyLinkedList.size);
    singlyLinkedList.deleteAt(0);
    singlyLinkedList.printList();

    singlyLinkedList.deleteList();
    System.out.println();
    singlyLinkedList.printList();
  }

}

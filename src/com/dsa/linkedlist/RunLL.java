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
    singlyLinkedList.deleteAt(1);
    System.out.println();
    singlyLinkedList.printList();
    System.out.println(singlyLinkedList.tail.value);
  }

}

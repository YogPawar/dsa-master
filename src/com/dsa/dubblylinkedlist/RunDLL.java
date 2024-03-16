package com.dsa.dubblylinkedlist;

import java.sql.SQLOutput;

public class RunDLL {

  public static void main(String[] args) {
    DubblyLinkedList dubblyLinkedList = new DubblyLinkedList(4);
    dubblyLinkedList.append(10);
    dubblyLinkedList.append(20);
    dubblyLinkedList.append(30);
    dubblyLinkedList.append(40);
    dubblyLinkedList.prepend(2);
    dubblyLinkedList.insert(33, 0);
    dubblyLinkedList.insert(43, 7);
    System.out.println();
    dubblyLinkedList.printInOrder();
    System.out.println();
    dubblyLinkedList.printInReverseOrder();


  }

}

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
    dubblyLinkedList.search(33);
    dubblyLinkedList.search(43);

    dubblyLinkedList.insert(45, 6);
    dubblyLinkedList.search(45);
    dubblyLinkedList.delete(6);
    dubblyLinkedList.printInOrder();


  }

}

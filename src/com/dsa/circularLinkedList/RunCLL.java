package com.dsa.circularLinkedList;

public class RunCLL {

  public static void main(String[] args) {
    CircularLinkedList circularLinkedList = new CircularLinkedList(5);
    circularLinkedList.append(15);
    circularLinkedList.append(34);
    circularLinkedList.append(67);
    circularLinkedList.insertAt(456, 2);
    System.out.println(circularLinkedList.head.value);
    System.out.println(circularLinkedList.tail.value);
    System.out.println();
    circularLinkedList.printCircularList();
    System.out.println();
    circularLinkedList.printWithoutSize();
    circularLinkedList.search(34);
    circularLinkedList.search(4563);

  }

}

package com.dsa.circularLinkedList;

import com.dsa.circularLinkedList.CircularLinkedList.Node;
import javax.swing.SwingUtilities;

public class RunCLL {

  public static void main(String[] args) {
    CircularLinkedList circularLinkedList = new CircularLinkedList(5);
    circularLinkedList.append(15);
    circularLinkedList.append(34);
    circularLinkedList.append(67);

    System.out.println("\nDeleted : " + circularLinkedList.delete(2));
    circularLinkedList.printWithoutSize();

    circularLinkedList.deleteAll();

    System.out.println(circularLinkedList.size);

  }

}

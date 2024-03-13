package com.dsa.circularLinkedList;

import java.awt.GraphicsConfigTemplate;
import java.sql.SQLOutput;

public class CircularLinkedList {

  public Node head;
  public Node tail;
  public int size;


  /**
   * TC : O(1), SC : O(1)
   *
   * @param value
   */
  public CircularLinkedList(int value) {
    Node node = new Node(value);
    head = node;
    tail = node;
    size++;
  }

  public void prepend(int value) {
    Node newNode = new Node(value);
    Node temp = head;
    if (temp == null) {
      head = newNode;
      tail = newNode;
      size++;
    } else {
      newNode.next = head;
      head = newNode;
      tail.next = newNode;
      size++;
    }
  }

  public void append(int value) {
    Node newNode = new Node(value);
    if (size < 0) {
      prepend(value);
    } else {
      tail.next = newNode;
      tail = newNode;
      newNode.next = head;
      size++;
    }
  }

  public void insertAt(int value, int index) {
    if (index < 0 && index > size) {
      System.out.println("Invalid index..!!");
    } else if (index == 0) {
      prepend(value);
    } else if (index == size) {
      append(value);
    } else {
      int destination = 1;
      Node newNode = new Node(value);
      Node previous = head;
      while (destination < index) {
        previous = previous.next;
        destination++;
      }
      newNode.next = previous.next;
      previous.next = newNode;
      size++;
    }
  }

  public void printCircularList() {
    Node fast = head;
    int index = 0;
    while (size > index) {
      System.out.print(fast.value + " ");
      fast = fast.next;
      index++;
    }
  }

  public void printWithoutSize() {
    Node temp = head;
    if (head != null) {
      do {
        System.out.print(temp.value + " ");
        temp = temp.next;
      } while (temp != head);
    }
  }

  public int search(int value) {
    Node temp = head;
    if (temp != null) {
      int index = 0;
      do {
        if (temp.value == value) {
          System.out.println("Value found at " + index);
          return index;
        }
        temp = temp.next;
        index++;
      } while (temp != head);
    }
    System.out.println("Value not found");
    return -1;
  }

  class Node {

    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

}

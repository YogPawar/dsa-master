package com.dsa.linkedlist;


import java.sql.SQLOutput;

public class SinglyLinkedList {

  public Node head;
  public Node tail;
  public int size;

  public Node create(int value) {
    Node node = new Node(value);
    node.next = null;
    node.value = value;
    head = node;
    tail = node;
    size++;
    return head;
  }

  public void prepend(int value) {
    Node node = new Node(value);
    if (head == null) {
      head = node;
      tail = node;
      return;
    }
    node.next = head;
    head.next = node;
    head = node;
    size++;
  }

  public void append(int value) {
    Node node = new Node(value);
    if (tail != null) {
      tail.next = node;
      tail = node;
      size++;
    } else {
      prepend(value); //insert node at first location
    }
  }

  public void insert(int value, int position) {
    if (position < 0) {
      System.out.println("Invalid Index");
      return;
    }
    if (position == 0) {
      prepend(value);
    } else if (position >= size) {
      append(value);
    } else {
      Node node = new Node(value);
      Node previous = head;
      Node temp = head;
      int index = 0;
      while (position != index) {
        previous = temp;
        temp = temp.next;
        index++;
      }
      previous.next = node;
      node.next = temp;
      size++;
    }
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + "  ");
      temp = temp.next;

    }
  }

  /**
   * SC : O(1) TC : O(N)
   *
   * @param value
   * @return
   */
  public boolean search(int value) {
    Node temp = head;
    int index = 0;
    if (temp == null) {
      return false;
    } else {
      while (temp != null) {
        if (temp.value == value) {
          System.out.println("Value at " + value + "found at " + index);
          return true;
        }
        temp = temp.next;
        index++;
      }
    }
    System.out.println("Value at " + value + " not found.");

    return false;
  }

  public void deleteAt(int index) {
    //if list is empty print no data present
    if (head == null) {
      System.out.println("List is empty nothing to delete...");
    } else if (index == 0) { //delete at index 0
      head = head.next;
      size--;
      if (size == 0) { //list is empty
        tail = null;
        head = null;
      }
    } else if (index >= size) { //delete last index
      //identify the second last element in list
      Node temp = head;
      while (temp.next.next != null) {
        temp = temp.next;
      }
      temp.next = null;
      tail = temp;
      size--;

      if (size < 0) {
        head = null;
        tail = null;
      }
    }
  }

  public void printSecondLast() {
    Node temp = head;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    System.out.println(temp.value);
  }

  class Node {

    public int value;
    public Node next;

    public Node(int value) {
      this.value = value;
    }

  }
}

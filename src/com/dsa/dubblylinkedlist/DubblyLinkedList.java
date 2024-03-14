package com.dsa.dubblylinkedlist;

public class DubblyLinkedList {

  Node head;
  Node tail;
  int size;

  public DubblyLinkedList(int data) {
    Node node = new Node(data);
    head = node;
    tail = node;
    size++;
  }

  public void append(int value) {
    Node node = new Node(value);
    if (size < 0) {
      head = node;
      tail = node;
    } else {
      node.next = head;
      head = node;
    }
    size += 1;
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public class Node {

    int data;
    Node prev;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

}

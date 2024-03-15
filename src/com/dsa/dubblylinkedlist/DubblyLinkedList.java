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
      Node temp = tail;
      temp.next = node;
      node.prev = temp;
      tail = node;
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

  public void prepend(int value) {
    Node node = new Node(value);
    if (size == 0) {
      head = node;
      tail = node;
    } else {
      Node temp = head;
      node.next = temp;
      temp.prev = node;
      head = node;
    }
    size++;
  }

  public void insert(int value, int index) {
    if (index < 0 || index > size) {
      System.out.println("Invalid Index");
      return;
    }
    if (index == 0) {
      prepend(value);
    } else if (index == size) {
      append(value);
    } else {
      Node newNode = new Node(value);
      Node dummyNode = head;
      int i = 0;
      while (i != index - 1) {
        dummyNode = dummyNode.next;
        i++;
      }
      newNode.next = dummyNode.next;
      dummyNode.next.prev = newNode;
      dummyNode.next = newNode;
      newNode.prev = dummyNode;
      size++;
    }
  }

  public Node delete(int value) {
    //TODO : Implement the delete functionality
   return null;
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

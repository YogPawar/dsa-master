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

  public void printInOrder() {
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

  public Node deleteFirst() {
    Node dummyNode = head;
    if (dummyNode != null) {
      head = dummyNode.next;
      head.prev = null;
      dummyNode.next = null;
      size--;
    }
    if (size < 0) {
      head = null;
      tail = null;
    }
    return dummyNode;
  }

  public Node deleteLast() {
    Node dummyNode = tail;
    if (dummyNode != null) {
      tail = dummyNode.prev;
      tail.next = null;
      size--;
    }
    if (size < 0) {
      tail = null;
      head = null;
    }
    return dummyNode;
  }

  public Node delete(int index) {
    Node dummyNode = head;
    if (index < 0 || index > size) {
      System.out.println("Invalid Index");
      return null;
    } else if (index == 0) {
      return deleteFirst();
    } else if (index == size) {
      return deleteLast();
    } else {
      int track = 0;
      while (track == index - 1) {
        dummyNode = dummyNode.next;
        track++;
      }
      Node deleteNode = dummyNode.next;
      dummyNode.next = deleteNode.next;
      deleteNode.next = null;
      deleteNode.prev = null;
      size--;
      return deleteNode;
    }
  }

  public void printInReverseOrder() {
    Node dummyNode = tail;
    while (dummyNode != null) {
      System.out.print(dummyNode.data + " ");
      dummyNode = dummyNode.prev;
    }
  }

  public void deleteDLL() {
    Node dummyNode = head;
    for (int i = 0; i < size; i++) {
      dummyNode.prev = null;
      dummyNode = dummyNode.next;
    }
    head = null;
    tail = null;
    size = -1;
    System.out.println("Delete DLL");
  }


  public int search(int value) {
    Node dummyNode = head;
    int index = 0;
    while (dummyNode != null) {
      if (dummyNode.data == value) {
        System.out.println("Value : " + value + " found at -> " + index);
        return index;
      }
      dummyNode = dummyNode.next;
      index++;
    }
    System.out.println("Element not found");
    return 0;
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

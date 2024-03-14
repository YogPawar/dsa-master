package com.dsa.circularlinkedlist;

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
    if (temp != null) {
      do {
        System.out.print(temp.value + " ");
        if (temp.next != null) {
          temp = temp.next;
        } else {
          break;
        }
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

  public Node deleteFirst() {
    Node temp = head;
    if (size == 1) {
      head = null;
      tail = null;
      size--;
      return temp;
    } else {
      head = head.next;
      tail.next = head;
      temp.next = null;
      size--;
    }
    if (size
        < 0) { //after removing the fist element if the size is become 0 it means there was no element in the list
      head = null;
      tail = null;
    }
    return temp;
  }

  public Node deleteLast() {
    Node temp = tail;
    if (size == 1) {
      return deleteFirst();
    } else {
      //find the second last location
      Node prev = head;
      do {
        prev = prev.next;
      } while (prev.next.next != head);
      tail.next = null;
      tail = prev;
      tail.next = head;
      size--;
      return temp;
    }
  }

  public Node delete(int index) {

    if (index > size && index < 0) {
      System.out.println("Invalid Index ");
      return null;
    } else if (index == 1) {
      return deleteFirst();
    } else if (index == size) {
      return deleteLast();
    } else {
      Node prev = head;
      int searchIndex = 0;
      while (index < searchIndex) {
        prev = prev.next;
        searchIndex++;
      }
      Node deleteNode = prev.next;
      prev.next = deleteNode.next;
      deleteNode.next = null;
      size--;
      return deleteNode;
    }
  }

  public void deleteAll() {
    head = null;
    tail = null;
    size = 0;

  }

  public class Node {

    int value;
    Node next;

    public Node(int value) {
      this.value = value;
    }
  }

}

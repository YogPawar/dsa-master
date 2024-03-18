package com.dsa.linkedlist.questions;

public class LinkedList {

  public Node head;
  public Node tail;
  public int size;

  public void create(int value) {
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    size++;
  }

  /**
   * Single linked list
   *
   * @param value
   */
  public void insert(int value) {
    Node newNode = new Node(value);
    tail.next = newNode;
    tail = newNode;
    newNode.next = null;
    size++;
  }

  public void traverse() {
    Node runner = head;
    while (runner != null) {
      System.out.print(runner.data);
      if (runner.next != null) {
        System.out.print("->");
      }
      runner = runner.next;
    }
  }


  public class Node {

    int data;
    Node next;
    Node prev;

    public Node(int data) {
      this.data = data;
    }
  }
}

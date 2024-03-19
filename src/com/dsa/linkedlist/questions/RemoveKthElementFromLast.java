package com.dsa.linkedlist.questions;

import com.dsa.linkedlist.questions.LinkedList.Node;

public class RemoveKthElementFromLast {

  public void remove(LinkedList list, int index) {
    int size = list.size - index; //kth element
    Node current = list.head;
    Node previous = null;
    int itr = 0;
    while (itr < size) {
      previous = current;
      current = current.next;
      itr++;
    }

    if (previous != null) {
      previous.next = current.next;
    }
    list.size--;
  }

  public Node returnKth(LinkedList list, int n) {
    Node current = list.head;
    Node ktheNode = list.head;

    //move ktheNode to nth location
    for (int i = 0; i < n; i++) {
      if (ktheNode == null) {
        return null;
      }
      ktheNode = ktheNode.next;
    }
    while (ktheNode != null) {
      current = current.next;
      ktheNode = ktheNode.next;
    }
    list.size--;
    return current;
  }
}

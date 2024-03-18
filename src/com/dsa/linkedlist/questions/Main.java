package com.dsa.linkedlist.questions;

import com.dsa.linkedlist.questions.LinkedList.Node;
import java.util.HashSet;

public class Main {

  public static void main(String[] args) {

    LinkedList list = new LinkedList();
    list.create(1);
    list.insert(3);
    list.insert(1);
    list.insert(1);
    list.insert(6);
    list.insert(2);
    list.insert(2);
    list.insert(6);
    list.insert(6);
    list.traverse();
    System.out.println();
    removeDups(list);
    list.traverse();

  }

  public static void removeDups(LinkedList list) {
    Node current = list.head;
    Node prev = null;

    HashSet<Integer> set = new HashSet<>();
    while (current != null) {
      int data = current.data;
      if (!set.add(data)) {
        prev.next = current.next;
        list.size--;
      } else {
        prev = current;
      }
      current = current.next;
    }
  }

}

package com.dsa.linkedlist.questions;

import com.dsa.linkedlist.questions.LinkedList.Node;
import java.util.HashSet;

public class RemoveDuplicate {

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

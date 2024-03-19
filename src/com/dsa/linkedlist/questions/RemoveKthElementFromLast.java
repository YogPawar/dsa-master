package com.dsa.linkedlist.questions;

import com.dsa.linkedlist.questions.LinkedList.Node;
import java.awt.desktop.AppReopenedEvent;
import javax.imageio.plugins.jpeg.JPEGImageReadParam;

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

}

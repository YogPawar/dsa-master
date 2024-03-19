package com.dsa.linkedlist.questions;

import com.dsa.linkedlist.questions.LinkedList.Node;
import java.util.HashSet;

public class Main {

  public static void main(String[] args) {

    LinkedList list = new LinkedList();
    RemoveKthElementFromLast removeKthElementFromLast = new RemoveKthElementFromLast();
    list.create(1);
    list.insert(2);
    list.insert(3);
    list.insert(4);
    list.insert(5);
    list.insert(6);

    list.traverse();
    int k = removeKthElementFromLast.returnKth(list, 2).data;
    System.out.println();
    System.out.println(k);
    list.traverse();

  }


}

package com.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import javax.sound.midi.MidiDevice;

/**
 * Remove the val from array and print the length off array after removing mentioned value e.e int[]
 * arr ={1,2,1,3,4,1,1,6} val =1 output = 4 as after removing the 1 array will look like
 * {2,3,4,6,_,_,_,_}
 */
public class RemoveElement {

  public static void main(String[] args) {
    RemoveElement removeElement = new RemoveElement();
    System.out.println(removeElement.removeElement(new int[]{1, 2, 1, 2, 3, 4, 5, 1, 1}, 1));
  }

  private int removeElement(int[] array, int val) {
    //if array size is 0 return
    if (array.length == 0) {
      return 0;
    }

    int index = 0;
    for (int j = 0; j < array.length; j++) {
      if (array[j] != val) {
        array[index] = array[j];
        index++;
      }
    }
    if (index < array.length) {
      for (int i = index; i < array.length; i++) {
        array[i] = 0;
      }
    }
    System.out.println(Arrays.toString(array));
    return index;
  }
}

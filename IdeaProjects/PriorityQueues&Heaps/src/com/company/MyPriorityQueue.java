package com.company;

import java.lang.Comparable;

public interface MyPriorityQueue<T> {
  
  T removeMinimum(); //removes and return the min element
  T minimum(); //returns without removing
  void add(T element);
  boolean isEmpty();
  int size();
}

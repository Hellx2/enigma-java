package com.github.hellagoodcoder123.numeric;

import com.github.hellagoodcoder123.*;

public class Randomizer {
  public static ranint(int start,int end){
    return Math.floor(Math.random()*((end+1)-start))+start;
  }
  public static ranint(int end){
    return ranint(0,end);
  }
  public static ran(double min,double max){
    return (Math.random()*(max-min))+min;
  }
}

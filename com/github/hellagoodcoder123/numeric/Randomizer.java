package com.github.hellagoodcoder123.numeric;

import com.github.hellagoodcoder123.*;

public class Randomizer {
  public static int ranint(int start,int end){
    if(end<start)throw new NumberOutOfRangeException;
    if(end==start)return end;
    return Math.floor(Math.random()*((end+1)-start))+start;
  }
  public static int ranint(int end){
    return ranint(0,end);
  }
  public static double ran(double min,double max){
    if(max<min)throw new NumberOutOfRangeException;
    if(max==min)return max;
    return (Math.random()*(max-min))+min;
  }
  public static double ran(double max){
    return ran(0,max);
  }
  public static Object randomItem(Object[] array){
    return array[ranint(0,array.length)];
  }
}

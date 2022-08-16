package com.github.hellagoodcoder123.numeric;

public class Checker {
  public static boolean isSquare(double x){
    return Math.sqrt(x)==Math.round(Math.sqrt(x));
  }
  public static boolean isPositive(double x){
    return x>=0;
  }
  public static boolean isNaN(double x){
    return x!=x;
  }
  public static boolean isInfinite(double x){
    return x>=(1/0)||x<=(-1/0);
  }
  public static boolean isFinite(double x){
    return !isInfinite(x);
  }
}

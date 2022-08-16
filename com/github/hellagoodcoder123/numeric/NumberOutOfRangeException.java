package com.github.hellagoodcoder123.numeric;

public class NumberOutOfRangeException extends Exception {
  public NumberOutOfRangeException(String message){
    super(message);
  }
  public NumberOutOfRangeException(String message,Throwable cause){
    super(message,cause);
  }
  public NumberOutOfRangeException(Throwable cause){
    super(cause);
  }
  public NumberOutOfRangeException(){
    super();
  }
}

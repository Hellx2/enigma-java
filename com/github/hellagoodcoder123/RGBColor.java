package com.github.hellagoodcoder123;

public class RGBColor extends Entity {
  public byte red;
  public byte green;
  public byte blue;
  public String toString(){
    return "rgb("+String.valueOf(red+128)+", "+String.valueOf(green+128)+", "+String.valueOf(blue+128)+")";
  }
  public HexColor toHex(){
    return new HexColor(red,green,blue);
  }
  public RGBColor(byte red,byte green,byte blue){
    this.red=red;
    this.green=green;
    this.blue=blue;
  }
}

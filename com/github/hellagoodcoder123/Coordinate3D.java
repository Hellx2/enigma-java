package com.github.hellagoodcoder123;

public class Coordinate3D extends Entity {
  private double x;
  private double y;
  private double z;
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public double getZ(){
    return z;
  }
  public void setX(double x){
    this.x=x;
  }
  public void setY(double y){
    this.y=y;
  }
  public void setZ(double z){
    this.z=z;
  }
  public Coordinate3D(double x,double y,double z) {
    this.x=x;
    this.y=y;
    this.z=z;
  }
}

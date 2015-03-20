package com.designpattern.creational.abstractfactorypattern;

//Spring文本框类：具体产品  
class SpringTextField implements TextField {  
  public void display() {  
      System.out.println("显示绿色边框文本框。");  
  }  
}  

package com.sudharsanan;
public class Addition{


public static  void main(String[] args)
{
    int a=10;
    int b=8;
    System.out.println("add: "+add(a,b)); 
}
public static int add(int a, int b){ 
    
    int c=a+b;
 
    System.out.println("addition of a and b is" +c);
    return c;
}
}
package com.edureka.advancedjava.module1;

import java.io.PrintStream;
import java.util.Scanner;

public class test2
{
  public test2() {}
  
  void display(int[] id, double[] salary, String[] name)
  {
    System.out.println("ID            Name          Salaray");
    
    int length = id.length;
    for (int i = 0; i < length; i++)
    {
      System.out.println(id[i] + "             " + name[i] + "          " + salary[i]);
    }
  }
  




  void display(int[] id, String[] name)
  {
    System.out.println("ID            Name   ");
    
    int length = id.length;
    for (int i = 0; i < length; i++)
    {
      System.out.println(id[i] + "            " + name[i] + "        ");
    }
  }
  



  void display(String searchName, int[] id, String[] name, double[] sal)
  {
    System.out.println("ID            Name          Salaray");
    
    int length = id.length;
    for (int i = 0; i < length; i++)
    {

      if (name[i].equals(searchName)) {
        System.out.println(id[i] + "            " + name[i] + "          " + sal[i]);
      }
    }
  }
  



  public static void main(String[] args)
  {
    int[] id = new int[5];
    double[] salary = new double[5];
    String[] name = new String[5];
    


    Scanner sc = new Scanner(System.in);
    


    for (int i = 0; i < 5; i++)
    {
      System.out.println("Enter employee record in ID Name salaray format...");
      id[i] = sc.nextInt();
      name[i] = sc.next();
      salary[i] = sc.nextDouble();
    }
    

    test2 m1 = new test2();
    m1.display(id, salary, name);
    System.out.println();
    
    m1.display(id, name);
    
    System.out.println("Enter a name to search for...");
    String searchName = sc.next();
    m1.display(searchName, id, name, salary);
  }
}

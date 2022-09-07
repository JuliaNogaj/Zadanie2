package org.example;

public class Main {
    public static void main(String[] args)
    {
  Prostokat prostokat1 = new Prostokat();
  System.out.println(prostokat1.weight);
  System.out.println(prostokat1.height);
  Prostokat prostokat2 = new Prostokat(8,9);
  System.out.println(prostokat2.weight);
  System.out.println(prostokat2.height);
  Prostokat prostokat3 = new Prostokat(3);
  System.out.println(prostokat3.weight);
  System.out.println(prostokat3.height);

    }


    }
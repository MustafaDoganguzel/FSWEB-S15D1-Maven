package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Grocery {
    public static ArrayList groceryList = new ArrayList<>();

    public void startGrocery(){
       Scanner scanner = new Scanner(System.in);
       int deger = scanner.nextInt();

       if(deger == 0 ){
          return;
       } else if (deger == 1) {
           System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
       } else if (deger == 2){
           System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
       }

    }
    public static void addItems(String input){
        String[] prod = input.split(",");
        for(String p : prod ){
            if(!checkItemIsInList(p)){
                groceryList.add(p);
            }
        }
        printSorted();
    }

    public static void removeItems(String input){
//        groceryList.remove(input);
        String[] prod = input.split(",");
        for (String p : prod){
            if (checkItemIsInList(p)){
                groceryList.remove(p);
                printSorted();
            }
        }
    }
    public static boolean checkItemIsInList(String product){
        return groceryList.contains(product);
    }
    public static void printSorted(){
        Collections.sort(groceryList);
        for(Object item : groceryList){
            System.out.println(item);
        }
    }

}

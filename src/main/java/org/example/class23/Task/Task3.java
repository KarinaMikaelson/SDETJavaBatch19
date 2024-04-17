package org.example.class23.Task;

import java.util.ArrayList;

/*
Create an arrayList of drinks call it. If any drink has letter "a" or "e" replace the whole word with water.
 */
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList();
        drinks.add("Cola");
        drinks.add("Sprite");
        drinks.add("Fanta");
        drinks.add("Red Bull");
        for(int i = 0; i < drinks.size(); i++){
            String drink = drinks.get(i);
            if(drink.contains("a") || drink.contains("e")){
                drinks.set(i,"water");
            }
        }
        for(String drink:drinks){
            System.out.println(drink);
        }
    }
}

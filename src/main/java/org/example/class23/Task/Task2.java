package org.example.class23.Task;
/*
Create an arraylist of cars and retrieve all the values using 2 different ways.
 */
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList();
        cars.add("Toyota");
        cars.add("Porsche");
        cars.add("Ford");
        cars.add("BMW");
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        for(String car:cars){
            System.out.println(car);
        }

    }


}

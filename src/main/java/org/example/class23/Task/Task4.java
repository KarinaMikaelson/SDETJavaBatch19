package org.example.class23.Task;

import java.util.ArrayList;

/*
Create an arrayList of words. Remove every word that ends with "e"
 */
public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList();
        words.add("Cat");
        words.add("Dog");
        words.add("Parrot");
        words.add("Cow");
        for(int i = 0; i < words.size(); i++){
            String word = words.get(i);
            if(word.endsWith("t")){
                words.remove(i);
            }
        }
        for(String word:words){
            System.out.println(word);
        }
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> lis = new ArrayList<>();
        lis.add("Hello");
        lis.add("Hi");

        for(String str : lis){
            System.out.println(str);

            try{
                System.out.println("Print the statement");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

package com.marion;

public class JavaArrays {
    public static void main(String[] args) {
        int marks[] = {50,12,23,34,45,56,67,78,89,90};
        String names[]={"Colo","David","Jersey","Alan","Asachi"};
        System.out.println(marks[0]);
       try{
           System.out.println(names[10]);
       }
        catch(Exception e)
        {
            System.out.println("Error while fetching the name");
        }

    }
}

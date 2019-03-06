package com.marion;


import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList();
        names.add("Asachi");
        names.add("Sammy");
        names.add("Arnari");
        names.add("Derrick");
        names.add("David");
        names.add("Othnel");
        names.add("Morewn");
        names.add("Luvee");
        System.out.println(names.get(1));

        names.remove(2);
        System.out.println( names.size() );

        names.clear();
        System.out.println( names.size() );

    }
}

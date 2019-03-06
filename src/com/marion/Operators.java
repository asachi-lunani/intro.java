package com.marion;

public class Operators {
    public static void main(String[] args) {
        // - + /* -operators
        //comparison operators <,>,>=,<=
        // and or
        System.out.println(10 + 20);
        String fname ="John";
        String lname ="Kim";
        int age = 21;
        String full_name = fname + " " + lname + " " + age;
        System.out.println(full_name);

        System.out.println(10/(double)3);
        //casting-convert something
        int z = 10;
        System.out.println((double)z );
        int k =(int)10.99;
        System.out.println(k);
        System.out.println(10>20);
        System.out.println(10<=20);
        System.out.println(10==10.0);
        int j = 10;
        double h =10.0;
        System.out.println(j == h);
        String name ="Mary";
        String jina="mary";
        System.out.println(name == jina);//wrong way
        System.out.println(name.equals(jina));
        System.out.println(name.equalsIgnoreCase(jina));

        System.out.println(100000 % 44);//modulus
        //and
        System.out.println( 100 > 200 && "Jina".equals("Jina"));//and
        System.out.println( 100 > 200 || "Jina".equals("Jina"));//or
        System.out.println(10 != 20);//not equal
        System.out.println(!"Kenya".equals("kenya")); //in strings not equal























    }
}

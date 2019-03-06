package com.marion;

public class Functions {
private double volumeSphere(double radius){
   double volume=22/7.0 *Math.pow(radius,3)*4/3.0;
   return volume;

}





    public static double areaCircle(double radius){//void-doesnt return anything

double area=22/7.0 *radius*radius;
        System.out.println(area);
        return area;
    }
    public static void main(String[] args) {
    //non static functions can be accessed using objects==variables
        Functions f =new Functions();
        System.out.println(f.volumeSphere(7));
        double v = f.volumeSphere(21);
        Functions.areaCircle(28);







    /* areaCircle(7);
     areaCircle(723.5698);
     areaCircle(789.23);
     areaCircle(154.56);
     double result = areaCircle(562.231);
        System.out.println(Math.round(result));
        System.out.println(result*12);*/

    }
}

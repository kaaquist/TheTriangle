package com.tradeshift;

public class Main {

    /**
     * method that test to see which type of triangle a trangle is base on the three sides length
     * return "Equilateral", "Isosceles" or "Scalene" based on the three sides.
     * @param a int
     * @param b int
     * @param c int
     * @return String
     */
    public static String testTriangle(int a, int b, int c){
        if ((a == c) & (b == c)) {
            return "Equilateral";
        } else if (((a == c) && b != c) || (a == b && b != c) || (b == c && b != a)) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }


    public static void main(String[] args) {
        Triangle triangle = new Triangle(9,9,9);
        System.out.println("isEquilateral: " + triangle.isEquilateral());
        System.out.println("isIsosceles: " + triangle.isIsosceles());
        System.out.println("isScalene: " + triangle.isScalene());
        System.out.println(triangle.toString());
        System.out.println(testTriangle(5,10,5));
    }
}

package com.tradeshift;

/**
 * Created by kasper on 04/04/16.
 *
 * Class for Triangles.
 */
public class Triangle {

    /* private variables for triangle sides */
    private int sideA = 0;
    private int sideB = 0;
    private int sideC = 0;

    /**
     * @param a int
     * @param b int
     * @param c itn
     */
    public Triangle (int a, int b, int c){
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    /**
    * Check to see if triangle is Isosceles
    * @return boolean
    */
    public boolean isEquilateral(){
        return (getSideA() == getSideC()) && (getSideB() == getSideC());
    }

    /**
    * Check to see if triangle is Isosceles
    * @return boolean
    */
    public boolean isIsosceles(){
        return (((getSideA() == getSideC()) && getSideB() != getSideC()) ||
                (getSideA() == getSideB() && getSideB() != getSideC()) ||
                        (getSideB() == getSideC() && getSideB() != getSideA()));
    }

    /**
    * Check to see if triangle is Scalene
    * @return boolean
    */
    public boolean isScalene(){
        return ((getSideA() != getSideC()) && getSideB() != getSideC() && getSideA() != getSideB()) ||
                (getSideA() != getSideB() && getSideB() != getSideC() && getSideA() != getSideC()) ||
                (getSideB() != getSideC() && getSideB() != getSideA() && getSideA() != getSideC());
    }

    @Override
    public String toString() {
        if (isEquilateral()) return "Triangle is Equilateral || SideA = : " + getSideA() + " || SideB = : " + getSideB() + " || SideC = : " + getSideC();
        if (isIsosceles()) return "Triangle is Isosceles || SideA = : " + getSideA() + " || SideB = : " + getSideB() + " || SideC = : " + getSideC();
        if (isScalene()) return "Triangle is Scalene || SideA = : " + getSideA() + " || SideB = : " + getSideB() + " || SideC = : " + getSideC();
        return super.toString();
    }
}
package com.example.kotlin_learning_part1.fandamentals;

public class InteroperabilityExampleJava {
    public static void main(String[] args) {

        //MyKotlinClass.findVolume(2,3,4); // java doesn't allow default functions for that reason
        MyKotlinClass.findVolume(2,3); // this is possible for using @JvmOverloads annotation
        int sum = InteroperabilityKotlinKt.add(3, 4); // this method call from a kotlin file
        System.out.println(sum);
    }

    public static int getArea(int l, int b) {
        return l * b;
    }

}

package com.ihs;

public class Main {

    public static void main(String[] args) {

	StringBuilder str = new StringBuilder();
	str.append("runnerup to running.");

        System.out.println(str.toString());

    StringBuilder stringTwo = new StringBuilder();
    stringTwo.append("so pedal");
        System.out.println(stringTwo.toString());

        System.out.println(stringTwo.capacity());

//    StringBuilder reverseString = stringTwo.reverse();
//
//        System.out.println(reverseString);

        stringTwo.appendCodePoint(45);

        System.out.println("Appended  = " + stringTwo);

    }
}

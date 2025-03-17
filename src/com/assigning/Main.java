// Java program to demonstrate assigning
package com.assigning;

// Class Box
class Box {

    double width;
    double length;
    double depth;

}

// Class Main
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating an object of class Box
        Box box = new Box();

        // Assigning to box1 reference to object box
        Box box1 = box;

        // Printing values of width, length, and depth of box
        System.out.println("Box width = " + box.width + " length = " + box.length + " depth = " + box.depth);

        // Printing values of width, length, and depth of box1
        System.out.println("Box1 width = " + box1.width + " length = " + box1.length + " depth = " + box1.depth);

        // Assigning values to box and box1 through box1
        box1.width = 2.5;
        box1.length = 3.0;
        box1.depth = 2.7;

        // Printing values of width, length, and depth of box
        System.out.println("Box width = " + box.width + " length = " + box.length + " depth = " + box.depth);

        // Printing values of width, length, and depth of box1
        System.out.println("Box1 width = " + box1.width + " length = " + box1.length + " depth = " + box1.depth);

    }
}
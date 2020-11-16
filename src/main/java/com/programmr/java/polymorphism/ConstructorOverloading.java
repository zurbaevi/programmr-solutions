package com.programmr.java.polymorphism;

/**
 * @author Nika Zurbaevi
 */
public class ConstructorOverloading {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);
        int vol;
        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);
        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);
        vol = myCube.volume();
        System.out.println("Volume of myCube is " + vol);
    }
}

class Box {
    int width;
    int height;
    int depth;

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box(int width) {
        this.width = width;
        this.height = width;
        this.depth = width;
    }

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    int volume() {
        return width * height * depth;
    }
}

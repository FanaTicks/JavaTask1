package org.example.task3;

public class Cube extends Shape {
    private int heightCube;
    public Cube(int heightCube) {
        this.heightCube = heightCube;
    }

    public double getVolume() {
        return Math.pow(heightCube, 3);
    }

}

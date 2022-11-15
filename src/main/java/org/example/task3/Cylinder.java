package org.example.task3;

public class Cylinder extends Shape {
    private int radiusCylinder;
    private int heightCylinder;
    public Cylinder(int radiusCylinder,int heightCylinder) {
        this.radiusCylinder = radiusCylinder;
        this.heightCylinder = heightCylinder;
    }

    public double getVolume() {
        return (3.14 * Math.pow(radiusCylinder, 2) * heightCylinder);
    }

}

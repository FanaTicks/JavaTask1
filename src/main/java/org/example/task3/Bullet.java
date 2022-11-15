package org.example.task3;

public class Bullet extends Shape {
    private int radiusBullet;
    public Bullet(int radiusBullet) {
        this.radiusBullet = radiusBullet;
    }
    public double getVolume() {
        return (4 * 3.14 * Math.pow(radiusBullet, 2));
    }

}

package org.example.task3;

import java.util.*;
import java.util.stream.Collectors;

public class Shape {
    protected static double heightCube = 24;
    protected static double radiusBullet = 32;
    protected static double heightCylinder = 342;
    protected static double radiusCylinder = 32;
    protected static double volumeZero = 0;

    public static double Volume() {
        return volumeZero;
    }

    public Map<String, Integer> SortShape(Collection stringList) {
        if (stringList.isEmpty()) {
            throw new IllegalArgumentException("Collection is empty!");
        }
        stringList.remove(null);//удаление пустых строчек

        Map<String, Integer> map = new HashMap<>();
        for (Object s : stringList) {
            if (s.equals("Cube"))
                map.put("Куб", (int) org.example.task3.Cube.Volume());
            else if (s.equals("Bullet"))
                map.put("Куля", (int) org.example.task3.Bullet.Volume());
            else if (s.equals("Cylinder"))
                map.put("Цилiндр", (int) org.example.task3.Cylinder.Volume());
        }

        return          map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal, LinkedHashMap::new
                ));
    }
}
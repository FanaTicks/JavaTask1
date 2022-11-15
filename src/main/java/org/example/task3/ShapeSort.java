package org.example.task3;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ShapeSort {
    public Map<String, Integer> SortShape(Collection stringList) {
        for (Object value : stringList) {
            if (value == null){
                throw new IllegalArgumentException("Null element!");
            }}//проверка на Null
        if (stringList.isEmpty()) {
            throw new IllegalArgumentException("Collection is empty!");
        }
        stringList.remove(null);//удаление пустых строчек
        Bullet Bullet = new Bullet(407);
        Cube Cube = new Cube(7);
        Cylinder Cylinder = new Cylinder(23, 427);
        Map<String, Integer> map = new HashMap<>();
        for (Object s : stringList) {
            if (s.equals("Cube"))
                map.put("Куб", (int) Cube.getVolume());
            else if (s.equals("Bullet"))
                map.put("Куля", (int) Bullet.getVolume());
            else if (s.equals("Cylinder"))
                map.put("Цилiндр", (int) Cylinder.getVolume());
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

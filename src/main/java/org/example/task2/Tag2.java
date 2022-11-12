package org.example.task2;

import java.util.*;
import java.util.stream.Collectors;

public class Tag2 {
    public Map<String, Integer> TopTeg(ArrayList<String> secondList) {

        if (secondList.isEmpty()) {
            throw new IllegalArgumentException("List is empty!");
        }//проверка на пустой лист

        secondList.remove(null);//удаление пустых строчек

        Map<String, Integer> map = new HashMap<>();
        for (String s : secondList) {
            String[] words = Arrays.stream(s.split(" ")).distinct().toArray(String[]::new);//расделение строки на масив подстрок и удаление повторов
            for (String k : words) {
                if (k.charAt(0) == '#') {//поиск тегов
                    if (map.containsKey(k)) {
                        int get = map.get(k);//импорт значения ключа
                        map.put(k, ++get);//повышение значения ключа
                    }
                    else {
                        map.put(k, 1);//добавление ключа
                    }
                }
            }
        }

        return         map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal, LinkedHashMap::new
                ));//сортировка и ограничение мапы
    }
}
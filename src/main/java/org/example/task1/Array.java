package org.example.task1;

import java.util.Collections;
import java.util.List;

public class Array {
    public List<Integer> sortArray(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty!");
        }//проверка на пустой лист

        list.removeIf(value -> value < 0);//удаление элементов которые меньше 0
        list.sort(Collections.reverseOrder());//сортировка масива по убыванию
        return list;
    }
}

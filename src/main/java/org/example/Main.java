package org.example;

import org.example.task1.Array;
import org.example.task2.Tag2;
import org.example.task3.Shape;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, -2, 4, 10, -22, 35, -14, 45));
        Array array = new Array();
        System.out.println(array.sortArray(list));

        ArrayList<String> secondList2 = new ArrayList<>();
        secondList2.add("#Hello wdadwa #wda #Hello #Helflo #Helfdalo");
        secondList2.add("awdgr #Heldwalo wdadwa #wda #Helflo");
        secondList2.add("#Helflo wdadwa #wwadda wdaadw #Hello");
        Tag2 teg2 = new Tag2();
        System.out.println(teg2.TopTeg(secondList2));

        Collection col = new ArrayList();
        col.add("Cube");
        col.add("Bullet");
        col.add("Cylinder");
        Shape shape = new Shape();
        System.out.println(shape.SortShape(col));

    }
}
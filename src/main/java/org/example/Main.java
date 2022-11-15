package org.example;

import org.example.task1.Array;
import org.example.task2.Tag;
import org.example.task3.ShapeSort;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //task1
        List<Integer> list = new ArrayList<>(List.of(5, -2, 4, 10, -22, 35, -14, 45));
        Array array = new Array();
        System.out.println(array.sortArray(list));

        //task2
        ArrayList<String> secondList2 = new ArrayList<>();
        secondList2.add("#Hello wdadwa #wda #Hello #Helflo #Helfdalo");
        secondList2.add("awdgr #Heldwalo wdadwa #wda #Helflo");
        secondList2.add("#Helflo wdadwa #wwadda wdaadw #Hello");
        Tag tag = new Tag();
        System.out.println(tag.TopTeg(secondList2));

        //task3
        Collection col = new ArrayList();
        col.add("Cube");
        col.add("Bullet");
        col.add("Cylinder");
        ShapeSort shapeSort= new ShapeSort();
        System.out.println(shapeSort.SortShape(col));

    }
}
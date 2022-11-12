import org.example.task2.Tag2;
import org.example.task3.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    public void testShapeEmpty() {
        //given
        Shape shape = new Shape();
        List<Object> stringList = List.of();

        try {
            shape.SortShape(stringList);
            Assertions.fail("Empty accepted");
        } catch (IllegalArgumentException e) {
            assertEquals("Collection is empty!", e.getMessage());
        }
    }

    @Test
    public void testShapeNull() {
        //given
        Collection col = new ArrayList();
        col.add("Cube");
        col.add(null);
        col.add("Cylinder");
        Shape shape = new Shape();
        Map<String, Integer> map = new HashMap<>();
        map.put("Куб", 13824);
        map.put("Цилiндр", 1099653);
        //when
        Map<String, Integer> result = shape.SortShape(col);
        //then
        assertEquals(map,result);
    }

    @Test
    public void testShapeRepetition() {
        //given
        Collection col = new ArrayList();
        col.add("Cube");
        col.add("Cube");
        col.add("Cylinder");
        Shape shape = new Shape();
        Map<String, Integer> map = new HashMap<>();
        map.put("Куб", 13824);
        map.put("Куб", 13824);
        map.put("Цилiндр", 1099653);
        //when
        Map<String, Integer> result = shape.SortShape(col);
        //then
        assertEquals(map,result);
    }
}

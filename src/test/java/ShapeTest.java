import org.example.task2.Tag;
import org.example.task3.Shape;
import org.example.task3.ShapeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    public void testShapeEmpty() {
        //given
        ShapeSort shapeSort= new ShapeSort();
        List<Object> stringList = List.of();
        IllegalArgumentException a =Assertions.assertThrows(IllegalArgumentException.class,()-> {
            shapeSort.SortShape(stringList);
        });
        Assertions.assertEquals("Collection is empty!",a.getMessage());
    }

    @Test
    public void testShapeNull() {
        //given
        Collection col = new ArrayList();
        col.add(null);
        ShapeSort shapeSort = new ShapeSort();
        IllegalArgumentException a =Assertions.assertThrows(IllegalArgumentException.class,()-> {
            shapeSort.SortShape(col);
        });
        Assertions.assertEquals("Null element!",a.getMessage());
    }

    @Test
    public void testShapeRepetition() {
        //given
        Collection col = new ArrayList();
        col.add("Cube");
        col.add("Cube");
        col.add("Cylinder");
        ShapeSort shapeSort= new ShapeSort();
        Map<String, Integer> map = new HashMap<>();
        map.put("Куб", 343);
        map.put("Куб", 343);
        map.put("Цилiндр", 709272);
        //when
        Map<String, Integer> result = shapeSort.SortShape(col);
        //then
        assertEquals(map,result);
    }
}

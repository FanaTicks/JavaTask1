import org.example.task1.Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayTest {
    @Test
    public  void  testArrayEmpty(){
        //given
        Array array = new Array();
        List<Integer> list = new ArrayList<>(List.of());

        try {
            array.sortArray(list);
            Assertions.fail("Empty accepted!");
        } catch (IllegalArgumentException e) {
            assertEquals("List is empty!", e.getMessage());
        }
    }

    @Test
    public  void  testArrayMinus(){
        //given
        Array array = new Array();
        List<Integer> list = new ArrayList<>(List.of(-5, -2, -4, -10, -22, -35, -14, -45));
        List<Integer> list1 = new ArrayList<>(List.of());
        //when
        List<Integer> result = array.sortArray(list);
        //then
        assertEquals(list1,result);
    }
}
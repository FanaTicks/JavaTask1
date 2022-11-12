import org.example.task2.Tag2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TagTest {
    @Test
    public void testTagNull() {
        //given
        ArrayList<String> secondList2 = new ArrayList<>();
        secondList2.add("#Hello wdadwa #Helflo");
        secondList2.add(null);
        secondList2.add("#Helflo wdadwa");
        Tag2 teg2 = new Tag2();
        Map<String, Integer> map = new HashMap<>();
        map.put("#Helflo", 2);
        map.put("#Hello", 1);
        //when
        Map<String, Integer> result = teg2.TopTeg(secondList2);
        //then
        assertEquals(map,result);
    }

    @Test
    public void testTagEmpty() {
        //given
        Tag2 tag = new Tag2();
        ArrayList<String> secondList = new ArrayList<>();

        try {
            tag.TopTeg(secondList);
            Assertions.fail("Empty accepted!");
        } catch (IllegalArgumentException e) {
            assertEquals("List is empty!", e.getMessage());
        }
    }

    @Test
    public void testTagDoubleTagInOneString() {
        //given
        ArrayList<String> secondList2 = new ArrayList<>();
        secondList2.add("#Hello wdadwa #Hello #Helflo #Hello #Hello #Hello");
        secondList2.add("#Helflo wdadwa");
        Tag2 teg2 = new Tag2();
        Map<String, Integer> map = new HashMap<>();
        map.put("#Helflo", 2);
        map.put("#Hello", 1);
        //when
        Map<String, Integer> result = teg2.TopTeg(secondList2);
        //then
        assertEquals(map,result);
    }
}

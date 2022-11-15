import org.example.task2.Tag;
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
        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("#Hello wdadwa #Helflo");
        secondList.add(null);
        secondList.add("#Helflo wdadwa");
        Tag tag = new Tag();
        IllegalArgumentException a =Assertions.assertThrows(IllegalArgumentException.class,()-> {
            tag.TopTeg(secondList);
        });
        Assertions.assertEquals("Null element!",a.getMessage());
    }

    @Test
    public void testTagEmpty() {
        //given
        Tag tag = new Tag();
        ArrayList<String> secondList = new ArrayList<>();
        IllegalArgumentException a =Assertions.assertThrows(IllegalArgumentException.class,()-> {
            tag.TopTeg(secondList);
        });
        Assertions.assertEquals("List is empty!",a.getMessage());
    }

    @Test
    public void testTagDoubleTagInOneString() {
        //given
        ArrayList<String> secondList2 = new ArrayList<>();
        secondList2.add("#Hello wdadwa #Hello #Helflo #Hello #Hello #Hello");
        secondList2.add("#Helflo wdadwa");
        Tag teg2 = new Tag();
        Map<String, Integer> map = new HashMap<>();
        map.put("#Helflo", 2);
        map.put("#Hello", 1);
        //when
        Map<String, Integer> result = teg2.TopTeg(secondList2);
        //then
        assertEquals(map,result);
    }
}

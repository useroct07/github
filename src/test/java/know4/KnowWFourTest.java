package know4;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class KnowWFourTest {

    KnowWFour underTest = new KnowWFour();
    ArrayList<String> testList = new ArrayList<>(Arrays.asList("Arbaaz","Rohit","Sidharth","Gowthami","Roger",
            "Sangeetha","Ankita","Omprakash","hwf","efbhwebf"));
    ArrayList<String> testListEmpty = new ArrayList<>();
    //  ArrayList testList1 = new ArrayList(Arrays.asList("Arbaaz","Rohit","Sidharth","Gowthami","Roger",
    //          "Sangeetha","Ankita","Omprakash",12,456));
    //   ArrayList<String> testListNull = null;

    @Test
    public void meetSchedulerTest() {
        assertTrue(underTest.meetScheduler(testList));
        //  assertFalse(underTest.meetScheduler(testList1));
    }

    @Test
    public void isArrayListEmptyTest() {
        assertFalse(underTest.isArrayListEmpty(testList));
        assertNotNull(KnowWFour.isArrayListEmpty(testList));
        assertTrue(underTest.isArrayListEmpty(testListEmpty));
    }

    @Test
    public void meetPairGeneratorTest(){
        assertEquals(underTest.meetPairGenerator(testList),testList);
        assertNotNull(underTest.meetPairGenerator(testList));
        assertNotSame(testListEmpty,underTest.meetPairGenerator(testList));
    }
}
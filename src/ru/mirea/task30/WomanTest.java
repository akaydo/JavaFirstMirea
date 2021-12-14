package ru.mirea.task30;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WomanTest {

    @Test
    public void testToString(){
        Woman w1 = new Woman("Irina", 58, "blue", "black", 22);
        Woman w2 = new Woman("Mia", 49, "green", "brown", 18);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Woman: " + "name=Irina" + "; " +
                "weight=58" + "; " +
                "eyesColor=blue" + "; " +
                "hairColor=black" + "; " +
                "age=22" +
                '.');
        expected.add("Woman: " + "name=Mia" + "; " +
                "weight=49" + "; " +
                "eyesColor=green" + "; " +
                "hairColor=brown" + "; " +
                "age=18" +
                '.');

        ArrayList<String> actual = new ArrayList<>();
        actual.add(w1.toString());
        actual.add(w2.toString());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHashCode(){
        Woman w1 = new Woman("Irina", 58, "blue", "black", 22);
        Woman w2 = new Woman("Mia", 49, "green", "brown", 18);
        Woman w3 = new Woman("Anna", 55, "blue", "black", 21);
        Woman w4 = new Woman("Kristina", 54, "green", "red", 20);

        ArrayList<Boolean> expected = new ArrayList<>();
        expected.add(false);
        expected.add(false);
        expected.add(false);

        ArrayList<Boolean> actual = new ArrayList<>();
        actual.add(w1.hashCode() == w2.hashCode());
        actual.add(w1.hashCode() == w3.hashCode());
        actual.add(w1.hashCode() == w4.hashCode());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void  testAlwaysNotPass(){
        Woman w1 = new Woman("Irina", 58, "blue", "black", 22);
        Woman w2 = new Woman("Mia", 49, "green", "brown", 18);

        String expected = "green";
        String actual = w2.getEyesColor();

        Assert.assertEquals(expected, actual);
    }
}
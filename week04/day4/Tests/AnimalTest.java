import animal.Animal;
import animal.Bird;
import animal.Reptile;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void AnimalTest_breed_ReturnString(){
        Animal birdy = new Bird("parrot", 1,"M","blue");
        assertEquals("laying eggs.", birdy.breed());
    }

    @Test
    public void AnimalTest_getName_ReturnString() {
        Animal reptile = new Reptile("kroki", 2, "F", "green");
        assertEquals("kroki", reptile.getName());
    }
}

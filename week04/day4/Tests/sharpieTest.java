import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sharpie.Sharpie;

import static org.junit.Assert.*;
public class sharpieTest {
    @Test
    public void Sharpie_use_ReturnFloat() {
        Sharpie sharpie1 = new Sharpie("red", 0.5f);
        assertEquals(99, sharpie1.use());
    }
}

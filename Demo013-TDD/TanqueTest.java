

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TanqueTest
{
    /**
     * Default constructor for test class TanqueTest
     */
    public TanqueTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    
    @Test
    public void debeDevolverEstaVivoTrue(){
        Tanque tanque1 = new Tanque();
        tanque1.setVida(1);
        
        //Afirmacion
        assertEquals(true,tanque1.estaVivo());
        
    }
    
    @Test
    public void debeDevolverEstaVivoFalse(){
        Tanque tanque1 = new Tanque();
        tanque1.setVida(0);
        
        //Afirmacion
        assertEquals(false,tanque1.estaVivo());
        
    }
    
    
    
    
}

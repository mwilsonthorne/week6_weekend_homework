import People.Guest;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Billy", 50);

    }

    @Test
    public void getName(){

        assertEquals("Billy", guest.getName());
    }

    @Test
    public void getWallet(){
        assertEquals(50, guest.getWallet());
    }














}





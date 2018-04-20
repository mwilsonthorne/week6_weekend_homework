import People.Guest;
import Room.BedRoom;
import Room.BedroomType;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;
    BedRoom bedroom1;

    @Before
    public void before(){
        guest = new Guest("Billy", 50);
        bedroom1 = new BedRoom("Orange", 4, BedroomType.FAMILY, 5, 100);

    }

    @Test
    public void getName(){

        assertEquals("Billy", guest.getName());
    }

    @Test
    public void getWallet(){
        assertEquals(50, guest.getWallet());
    }

    @Test
    public void canReduceWalletByRoomRate(){
        guest.payRoomRate(20);
        assertEquals(30, guest.getWallet());
    }














}





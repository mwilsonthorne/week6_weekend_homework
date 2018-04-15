import People.Guest;
import Room.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DiningRoomTest {

    DiningRoom diningroom;
    Guest guests;

    @Before
    public void Before(){
        diningroom = new DiningRoom("Marcelline Lounge", 100, "Breakfast");
        guests = new Guest("The Thorne Family", 1000);
    }

    @Test
    public void getDiningRoomName(){
        assertEquals("Marcelline Lounge", diningroom.getRoomName());
    }

    @Test
    public void getDiningRoomCapacity(){
        assertEquals(100, diningroom.getRoomCapacity());
    }

    @Test
    public void getSitting(){
        assertEquals("Breakfast", diningroom.getSitting());
    }

    @Test
    public void diningRoomEmpty(){
        assertEquals(0, diningroom.countGuests());
    }

    @Test
    public void addGuestToDiningRoom(){
        diningroom.addGuests(guests);
        assertEquals(1, diningroom.countGuests());
    }

    @Test
    public void canRemoveGuestsFromDiningRoom(){
        diningroom.removeGuests(guests);
        assertEquals(0, diningroom.countGuests());
    }



}

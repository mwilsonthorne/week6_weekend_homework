import People.Guest;
import Room.BedRoom;
import Room.BedroomType;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedroom;
    BedRoom bedroom2;
    Guest guest;
    Guest guest2;

    @Before
    public void Before(){
        bedroom = new BedRoom("Blue", 2, BedroomType.DOUBLE, 1, 70);
        bedroom2 = new BedRoom("Orange", 1, BedroomType.SINGLE, 10, 50);
        guest = new Guest("Matthew", 100);
        guest2 = new Guest("Mark", 80);
    }

    @Test
    public void getBedroomName() {
        assertEquals("Blue", bedroom.getRoomName());
    }

    @Test
    public void getBedRoomCapacity() {
        assertEquals(2, bedroom.getRoomCapacity());
    }

    @Test
    public void canGetType(){
        assertEquals(BedroomType.DOUBLE, bedroom.getType());
    }

    @Test
    public void canGetBedRoomNumber(){
        assertEquals(1, bedroom.getBedRoomNumber());
    }

    @Test
    public void canGetBedRoomRate(){
        assertEquals(70, bedroom.getBedRoomRate());
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuests(guest);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.removeGuests(guest);
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void checkSingleRoomCapacity(){
        bedroom2.addGuests(guest);
        assertEquals(1, bedroom2.countGuests());
    }


    @Test
    public void roomFullyBooked(){
        bedroom2.addGuests(guest);
        bedroom2.addGuests(guest2);
        assertEquals(1, bedroom2.countGuests());
    }




}

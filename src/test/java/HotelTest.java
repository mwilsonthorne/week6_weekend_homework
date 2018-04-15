import Abstract.Room;
import Hotel.Hotel;
import People.Guest;
import Room.BedRoom;
import Room.BedroomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Room room;


    @Before
    public void Before(){
        hotel = new Hotel("The Thorne Suite", "Drummond Lounge");
        guest = new Guest("Bill", 100);
        room = new BedRoom("Blue", 1, BedroomType.SINGLE, 10, 70);

    }

    @Test
    public void getConferenceRoom() {
        assertEquals("The Thorne Suite", hotel.getConferenceRoom());
    }


    @Test
    public void getDiningRoom(){
        assertEquals("Drummond Lounge", hotel.getDiningRoom());
        }

    @Test
    public void guestRoomEmpty(){
        assertEquals(0, hotel.countRooms());
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkIn(guest, room);
        assertEquals(1, room.getGroupGuests().size());

    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkIn(guest, room);
        assertEquals(1, room.getGroupGuests().size());
        hotel.checkOut(guest, room);
        assertEquals(0, room.getGroupGuests().size());
    }

    @Test
    public void canGetGroupGuestsForRoom(){
        hotel.checkIn(guest, room);
        assertEquals("Bill", hotel.getGuestsInRoom(room).get(0).getName());
    }


}

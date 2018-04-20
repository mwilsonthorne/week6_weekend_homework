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
    Guest guest2;
    BedRoom room;
    BedRoom room2;


    @Before
    public void Before(){
        hotel = new Hotel("The Thorne Suite", "Drummond Lounge");
        guest = new Guest("Bill", 100);
        guest2 = new Guest("Pam", 103);
        room = new BedRoom("Blue", 1, BedroomType.SINGLE, 10, 70);
        room2 = new BedRoom("Orange", 2, BedroomType.DOUBLE, 3, 100);
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
    public void canAddRoom() {
        hotel.addRoom(room);
        assertEquals(1, hotel.countRooms());
        }

    @Test
    public void canRemoveRoom() {
        hotel.addRoom(room);
        assertEquals(1, hotel.countRooms());
        hotel.removeRoom(room);
        assertEquals(0, hotel.countRooms());
    }

    //write a test which adds a room to the hotel
    //then get guestrooms of that hotel

    @Test
    public void canGetGuestRooms(){
        hotel.addRoom(room);
        assertEquals(1, hotel.getGuestrooms().size());
        assertEquals("Blue", hotel.getGuestrooms().get(0).getRoomName());
        assertEquals(1, hotel.getGuestrooms().get(0).getRoomCapacity());

    }


    @Test
    public void canCheckInGuest(){
        hotel.checkIn(guest, room);
        assertEquals(1, room.countGuests());

    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkIn(guest, room);
        assertEquals(1, room.countGuests());
        hotel.checkOut(guest, room);
        assertEquals(0, room.countGuests());
    }

    @Test
    public void canCheckInGuestAndCharge(){
        //arranged in our before
        // act - calling checkIn
        hotel.checkIn(guest, room);
        // assert
        assertEquals(1, room.countGuests());
        assertEquals(30, guest.getWallet());
//      room.payRoomRate(guest);

    }

    @Test
    public void canGetGroupGuestsForSingleRoom(){
        hotel.checkIn(guest, room);
        assertEquals("Bill", hotel.getGuestsInRoom(room).get(0).getName());
        assertEquals(1 , hotel.getGuestsInRoom(room).size());
        assertEquals(1 , room.countGuests());

    }

    @Test
    public void canGetGroupGuestsForDoubleRoom(){
        hotel.checkIn(guest, room2);
        hotel.checkIn(guest2, room2);
        assertEquals("Bill", hotel.getGuestsInRoom(room2).get(0).getName());
        assertEquals("Pam", hotel.getGuestsInRoom(room2).get(1).getName());
        assertEquals(2, hotel.getGuestsInRoom(room2).size());
        assertEquals(2, room2.countGuests());


    }



}



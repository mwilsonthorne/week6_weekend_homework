import People.Guest;
import Room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceroom;
    Guest company;

    @Before
    public void before(){
        conferenceroom = new ConferenceRoom("Stephen Hawking Memorial Room", 500, 1000);
        company = new Guest("Codeclan", 5000);
    }

    @Test
    public void getConferenceRoomName(){
        assertEquals("Stephen Hawking Memorial Room", conferenceroom.getRoomName());
    }

    @Test
    public void getConferenceRoomCapacity(){
        assertEquals(500, conferenceroom.getRoomCapacity());
    }

    @Test
    public void getConferenceRoomRate(){
        assertEquals(1000, conferenceroom.getConferenceRoomRate());
    }

    @Test
    public void addGuestToConferenceRoom(){
        conferenceroom.addGuests(company);
        assertEquals(1, conferenceroom.countGuests());
    }

    @Test
    public void removeGuestFromConferenceRoom(){
        conferenceroom.removeGuests(company);
        assertEquals(0, conferenceroom.countGuests());
    }













}

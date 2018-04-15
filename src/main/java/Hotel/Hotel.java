package Hotel;

import Abstract.Room;
import People.Guest;
import Room.BedRoom;

import java.util.ArrayList;

public class Hotel {

    private String conference_room;
    private String dining_room;
    private ArrayList<BedRoom> guestroom;

    public Hotel(String conference_room, String dining_room){
        this.conference_room = conference_room;
        this.dining_room = dining_room;
        this.guestroom = new ArrayList<>();
    }

    public String getConferenceRoom(){
        return this.conference_room;
    }

    public String getDiningRoom(){
        return this.dining_room;
    }

    public int countRooms(){
        return this.guestroom.size();
    }

    public void checkIn(Guest guest, Room room){
        room.addGuests(guest);
    }

    public void checkOut(Guest guest, Room room) {
        room.removeGuests(guest);
    }

    public ArrayList<Guest> getGuestsInRoom(Room room){
        return room.getGroupGuests();
    }


}

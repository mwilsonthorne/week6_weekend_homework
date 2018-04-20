package Hotel;

import People.Guest;
import Room.BedRoom;

import java.util.ArrayList;

public class Hotel {

    private String conference_room;
    private String dining_room;
    private ArrayList<BedRoom> guestrooms;

    public Hotel(String conference_room, String dining_room){
        this.conference_room = conference_room;
        this.dining_room = dining_room;
        this.guestrooms = new ArrayList<>();
    }

    public String getConferenceRoom(){
        return this.conference_room;
    }

    public String getDiningRoom(){
        return this.dining_room;
    }

    public ArrayList<BedRoom> getGuestrooms() {
        return this.guestrooms;
    }

    public int countRooms(){
        return this.guestrooms.size();
    }

    public void addRoom(BedRoom room){
        this.guestrooms.add(room);
    }

    public void removeRoom(BedRoom room){
        this.guestrooms.remove(room);
    }


    public void checkIn(Guest guest, BedRoom room){
        room.addGuests(guest);
    }

    public void checkOut(Guest guest, BedRoom room) {
        room.removeGuests(guest);
    }

    public ArrayList<Guest> getGuestsInRoom(BedRoom room){
        return room.getGroupGuests();
    }




}




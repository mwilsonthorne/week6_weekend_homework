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

    public ArrayList<BedRoom> getGuestroom() {
        return this.guestroom;
    }

    public int countRooms(){
        return this.guestroom.size();
    }

    public void addRoom(BedRoom room){
        this.guestroom.add(room);
    }

    public void removeRoom(BedRoom room){
        this.guestroom.remove(room);
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




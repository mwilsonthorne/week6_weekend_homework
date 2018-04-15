package Abstract;

import People.Guest;
import Hotel.Hotel;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private int capacity;
    private ArrayList<Guest> groupGuests;


    public Room(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.groupGuests = new ArrayList<>();

    }

    public String getRoomName(){
        return this.name;
    }

    public int getRoomCapacity(){
        return this.capacity;
    }

    public ArrayList<Guest> getGroupGuests() {
        return this.groupGuests;
    }

    public int countGuests(){
        return this.groupGuests.size();
    }

    public void addGuests(Guest guestToAdd) {
        if (countGuests() < capacity) {
            this.groupGuests.add(guestToAdd);
        }

    }

    public void removeGuests(Guest guestToRemove){
        this.groupGuests.remove(guestToRemove);
    }


}


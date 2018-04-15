package Room;

import Abstract.Room;


public class ConferenceRoom extends Room {

    private int rate;

    public ConferenceRoom(String name, int capacity, int rate) {
        super(name, capacity);
        this.rate = rate;
    }

    public int getConferenceRoomRate() {
        return this.rate;
    }

}

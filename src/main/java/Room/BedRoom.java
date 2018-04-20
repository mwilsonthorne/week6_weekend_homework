package Room;

import Abstract.Room;
import People.Guest;

public class BedRoom extends Room {

    private BedroomType type;
    private int roomnumber;
    private int rate;

    public BedRoom(String name, int capacity, BedroomType type, int room_number, int rate) {
        super(name, capacity);
        this.type = type;
        this.roomnumber = room_number;
        this.rate = rate;
    }

    public BedroomType getType(){
        return this.type;
    }

    public int getBedRoomNumber(){
        return this.roomnumber;
    }

    public int getBedRoomRate(){
        return this.rate;
    }

//    public int payRoomRate(Guest guest){
//        return this.rate -= guest;
//
//    }


}
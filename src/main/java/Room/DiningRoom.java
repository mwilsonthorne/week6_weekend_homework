package Room;

import Abstract.Room;

public class DiningRoom extends Room {

    private String sitting;

public DiningRoom(String name, int capacity, String sitting){

    super(name, capacity);
    this.sitting = sitting;
}

public String getSitting(){
    return this.sitting;
}




}

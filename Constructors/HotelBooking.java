public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking(){
        this.nights=1;
        this.guestName="Guest";
        this.roomType="Standard";
    }
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }

    HotelBooking(HotelBooking h){
        this.guestName=h.guestName;
        this.roomType=h.roomType;
        this.nights=h.nights;
    }
    void display(){
        System.out.println("Guest name: "+guestName);
        System.out.println("Room type: "+ roomType);
        System.out.println("Nights: "+nights);
    }
    public static void main(String[] args){
        HotelBooking h1=new HotelBooking();
        h1.display();
        HotelBooking h2=new HotelBooking("abc","Deluxe",3);
        h2.display();
        HotelBooking h3=new HotelBooking(h2);
        h3.display();
    }
}

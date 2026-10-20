public class HotelRoom {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private int numberOfNights;


    public void setRoomType(String roomType) {
        switch(roomType) {
            case "1": roomType= "standard" ;break;
            case "2": roomType= "deluxe"  ; break;
            case "3": roomType=  "Suite" ;break ;

        } this.roomType = roomType;
    }

        public String getRoomType() {
        return roomType;
    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
         this.pricePerNight = pricePerNight;}

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    public double calculateTotal(){
        double i =pricePerNight * numberOfNights;
        return applyDiscount(i);

    }

    public double applyDiscount(double i ) {
        if (roomType.equalsIgnoreCase("Suite")) {
            double F =i*0.9;
            setPricePerNight(F);
           return F;}
        else return i;}

    public HotelRoom(int roomNumber, String roomType, int pricePerNight, int numberOfNights) {
        setNumberOfNights(numberOfNights);
        setRoomNumber(roomNumber);
        setRoomType(roomType);
        setPricePerNight(pricePerNight);

    }

        public  String toString() {
            return "\n===== ROOM BOOKING =====" +
                    "\nRoom Number     : " + roomNumber +
                    "\nRoom Type       : " + roomType +
                    "\nPrice Per Night : " + pricePerNight +
                    "\nNumber of Nights: " + numberOfNights +
                    "\nTotal Cost      : " + calculateTotal() +
                    "\n========================";
        }

    }


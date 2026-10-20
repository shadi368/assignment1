import java.util.Scanner;
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter room number: ");
    int roomNumber=input.nextInt();
    System.out.println("Room Types:");
    System.out.println("1 - Standard");
    System.out.println("2 - Deluxe");
    System.out.println("3 - Suite");
    System.out.print("Enter room type: ");

    String roomType=input.next();

    System.out.print("Enter price per night: ");
    int pricePerNight=input.nextInt();
    input.nextLine();
    System.out.print("Enter number of nights: ");
    int numberOfNights=input.nextInt();
    input.nextLine();


    HotelRoom r1=new HotelRoom(roomNumber,roomType,pricePerNight,numberOfNights);

System.out.println(r1.toString());
    }


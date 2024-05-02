package ISP;
public class BasicPhone implements IContact, IMessage{
    public void makeCall(String number){
        System.out.println(number);
    }

    public void sendSMS(String number, String message){
        System.out.println("09123456789, Hello BasicPhone User!");
    }

}
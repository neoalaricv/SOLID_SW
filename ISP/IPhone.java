package ISP;

public class IPhone implements IContact, Safari, Camera, IMessage{
    public void makeCall(String number){
        System.out.println(number);
    }

    public void sendSMS(String number, String message){
        System.out.println(number + ", Hello Apple User!");
    }

    public void browseWeb(String url){
        System.out.println("iphone.ph");
    }

    public void takePicture(){
        System.out.println("Took a snapshot!");
    }

}
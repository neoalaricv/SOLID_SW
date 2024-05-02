package ISP;
public class Samsung implements IContact, Safari, Camera, IMessage{
    public void makeCall(String number){
        System.out.println(number);
    }

    public void sendSMS(String number, String message){
        System.out.println(number + ", Hello Galaxy User!");
    }

    public void browseWeb(String url){
        System.out.println("samsung.ph");
    }

    public void takePicture(){
        System.out.println("Took a snapshot!");
    }

}
package ISP;
public class Client{
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        IPhone iPhone = new IPhone();
        Samsung samsung = new Samsung();

        basicPhone.makeCall("Calling... 09123456789");
        basicPhone.sendSMS("09123456789", "Hello!");
        iPhone.makeCall("Calling... 09123456789");
        iPhone.sendSMS("09123456789", "Hello Apple User!");
        iPhone.browseWeb("iphone.ph");
        iPhone.takePicture();
        samsung.makeCall("Calling... 09123456789");
        samsung.sendSMS("09123456789", "Hello Galaxy User!"); 
        samsung.browseWeb("iphone.ph"); 
        samsung.takePicture();

    }
}
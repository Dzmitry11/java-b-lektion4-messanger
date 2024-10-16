package se.dzmitry.messanger;

public class Main {
    public static void main(String[] args) {
        Messanger emailMessanger = new EmailMessanger();
        MessageService service = new MessageService(emailMessanger);
        service.send("Hi, this is a test message!", "89850579967n@gmail.com");
    }
}

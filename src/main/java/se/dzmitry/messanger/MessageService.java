package se.dzmitry.messanger;

public class MessageService {
    //Här deklarareras ett klassattribut av typen Messanger (dvs interfacet)
    //Vi använder alltså polymorfism
    private Messanger messanger;

    public MessageService(Messanger messanger){
        this.messanger = messanger;
    }

    public void send(String message, String recipient){
        messanger.sendMessage(message, recipient);
    }

}

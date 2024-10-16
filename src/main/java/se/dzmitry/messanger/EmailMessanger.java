package se.dzmitry.messanger;

import se.dzmitry.SendEmail.SendingEmail;

public class EmailMessanger implements Messanger {
    SendingEmail sendingEmail = new SendingEmail("89850579967n@gmail.com", "cxuc hpjo xkbr laou");

    @Override
    public void sendMessage(String message, String recipient) {
        sendingEmail.sendEmail(recipient, "subject", message);
        //Simulerar sändning av e-post
        //Vi låtsas dock att metoden verkligen skickar mejl
        //System.out.println("Sending email to" + recipient +": " + message);
    }

}

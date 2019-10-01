/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.util.Properties;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Message;

/**
 *
 * @author peperony
 */
public class enviar {
    public enviar() throws MessagingException{
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");
        

        
        Session sesion = Session.getDefaultInstance(propiedad);
        String correoEnvia = "lalatro1999@gmail.com";
        String contrasena = "lalatro1999";
        String receptor = "jtn1999@outlook.com";
        String asunto = "ghgfhgfghfhfh";
        String mensaje= "dgdgdgdgdgdgdgdgdgdgfdgdgfdgfdgfdgdgdgfdgfdfgbjhkhk";
        
        MimeMessage mail = new MimeMessage(sesion);
        try {
            mail.setFrom(new InternetAddress (correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress (receptor));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            
            Transport transportar = sesion.getTransport("smtp");
            transportar.connect(correoEnvia,contrasena);
            transportar.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));          
            transportar.close();
            
            System.out.println("revise su correo");
            
            
        } catch (AddressException ex) {
             System.out.println("prror");
        } catch (MessagingException ex) {
             System.out.println("puta");
        }
    }
}

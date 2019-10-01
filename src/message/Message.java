/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;
import javax.mail.MessagingException;
import message.enviar;
/**
 *
 * @author peperony
 */
public class Message {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            new enviar();
        }catch (MessagingException e){
            System.out.println("Valio");
        }
    }
    
}

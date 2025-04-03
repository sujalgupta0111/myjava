import java.io.File;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
public class mail_sender{

	public static void main(String[] args) {
		
		System.out.println("Start");
		String from ="guptasujal2001@gmail.com";
		String pass ="coey zwzd etev kqwo";
		
        String to = "chiraggupta0111@gmail.com";
        String subject = "thanks for yo support";
        String msg = "for loan";
        
        //step 1 :- aurtherization making connectin with gmail
        Properties prop = new Properties();
        prop.put("mail.smtp.host","smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.ssl.enable", "true");
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        prop.put("mail.smtp.auth", "true");
        
        
        
        Session session =Session.getInstance(prop,new Authenticator() {
           /// form this we get session Object 
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(from,pass);
			}   });// tell the password and mail and prop give the cridentials from to where mail send
        
        MimeMessage message = new MimeMessage(session);
        MimeMultipart multi = new MimeMultipart();
        
        String path = "D:\\Learn\\learning.png";
        try 
        {
        	message.setFrom(from);
        	message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));//BCC,CC
        	//message.setText(msg); 
        	message.setSubject(subject);
        	//create differente body part and merge with multi part
        	
        	MimeBodyPart text = new MimeBodyPart();
        	text.setText(msg);
        	
        	MimeBodyPart filepath = new MimeBodyPart();
        	File file = new File (path);
        	filepath.attachFile(file);
        	
        	multi.addBodyPart(filepath);
        	multi.addBodyPart(text);
        	
        	message.setContent(multi);
        	
            Transport.send(message);
        	System.out.println("Sucessfully Send");
        	
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
        
       

	}

}

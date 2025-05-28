package com.lysmjc813;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Properties prop;
    static Session session;
    static MimeMessage message;
    public static void main(String[] args) throws Exception {
        generateAndSendEmail();
        System.out.println("\n\n ===> Your email has been sent successfully.");
    }

    public static void generateAndSendEmail() throws Exception {
        final String user = "eyeseo723@naver.com"; // 발신자의 이메일 아이디를 입력
        final String password = "******";
        // Step1 프로퍼티 생성
        prop = new Properties();
        //"mail.smtp.host"은 이메일 발송을 처리해줄 SMTP 서버를 나타냄
        //gmail을 사용할 때는 "smtp.gmail.com", 네이버를 사용할 때는 "smtp.naver.com"
        prop.put("mail.smtp.host", "smtp.naver.com");
        //"mail.smtp.port"은 SMTP서버와 통신하는 포트를 말하는데 gmail일 경우 465를 Naver의 경우 587을 사용.
        prop.put("mail.smtp.port", 465);
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.ssl.enable", "true");
        prop.put("mail.smtp.ssl.trust", "smtp.naver.com");

        //Step2 세션 설정
        Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

        //Step 3 메세지 작성
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));

            //수신자메일주소
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("eyeseo723@naver.com"));

            //Subject
            message.setSubject("메일 제목"); // 메일 제목을 입력

            //Text
            message.setText("메일 내용"); // 메일 내용을 입력

            //Step4 이메일 보내기
            Transport.send(message); // 전송
            System.out.println("Sent message successfully....");
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
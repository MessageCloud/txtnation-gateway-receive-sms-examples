import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
 
// Simple send SMS programm
public class SendSMS {
    public static String sendSMS(String src, String dst, String type, String dr, String user, String password, String msg) {
        String url;
        StringBuilder inBuffer = new StringBuilder();
        try {
            url = "http://smsc.txtnation.com:8091/sms/send_sms.php" +
                "?src=" + src + "&dst=" + dst + "&type=" + type +
                "&dr=" + dr + "&user=" + user + "&password=" + pass + "&msg=" + URLEncoder.encode(msg, "UTF-8") ;
        } catch (UnsupportedEncodingException e) {
            return null;
        }
        try {
            URL tmUrl = new URL(url);
            URLConnection tmConnection = tmUrl.openConnection();
            tmConnection.setDoInput(true);
            BufferedReader in = new BufferedReader(new InputStreamReader(tmConnection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                inBuffer.append(inputLine);
            in.close();
        } catch (IOException e) {
            return null;
        }
        return inBuffer.toString();
    }
    public static void main(String[] args) {
        // Example of use
        String response = sendSMS("447777000000", "447777111111", "0", "1","myUsername", "myPassword","My test message");
        System.out.println(response);
    }
}
using System;
using System.IO;
using System.Net;
using System.Text;
using System.Web;
 
namespace SendSMS {
    class Program {
        public static string SendSMS(string src, string dst, string type, string dr, string user, string password, string msg) {
            StringBuilder sb  = new StringBuilder();
            byte[]        buf = new byte[1024];
            string url = "http://smsc.txtnation.com:8091/sms/send_sms.php" +
                "?src=" + src + "&dst=" + dst + "&type=" + type +
                "&dr=" + dr + "&user=" + user + "&password=" + password + "&msg=" + HttpUtility.UrlEncode(message);
            HttpWebRequest request = (HttpWebRequest)WebRequest.Create(url);
            HttpWebResponse response = (HttpWebResponse)request.GetResponse();
            Stream resStream = response.GetResponseStream();
            string tempString = null;
            int count = 0;
            do {
                count = resStream.Read(buf, 0, buf.Length);
                if (count != 0) {
                    tempString = Encoding.ASCII.GetString(buf, 0, count);
                    sb.Append(tempString);
                }
            }
            while (count > 0);
            return sb.ToString();
        }
        static void Main(string[] args) {
            string respXML = SendSMS("447777000000", "447777111111", "0", "1","myUsername", "myPassword","My test message");
            Console.WriteLine(respXML);
       }
    }
}
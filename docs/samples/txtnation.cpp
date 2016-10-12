#include <iostream>
#include <string>
#using <System.Dll>
#using <System.Web.Dll>
 
using namespace std;
using namespace System;
using namespace System::Web;
using namespace System::Net;
using namespace System::IO;
using namespace System::Runtime::InteropServices;
 
ref class SMSSender
{
 
private:
        static String^ Username = "myUsername";
        static String^ Password = "myPassword";
 
public:
        SMSSender()
        {}
        String^ SendSMS(String^ src, String^ dst, String^ type, String^ dr, String^ user, String^ password, String^ msg)
        {
                Message = HttpUtility::UrlEncode(Message);
                String^ URL = "http://smsc.txtnation.com:8091/sms/send_sms.php?&username=" + "?src=" + src + "&dst=" + dst + "&type=" + type +"&dr=" + dr + "&user=" + user + "&password=" + password + "&msg=" + Message;
                WebRequest^ Handle = WebRequest::Create(URL);
                WebResponse^ HTTPResponse = Handle->GetResponse();
                StreamReader^ Stream = gcnew StreamReader(HTTPResponse->GetResponseStream());
                String^ Response = Stream->ReadToEnd()->Trim();
                HTTPResponse->Close();
                return Response;
        }
};
 
int main() {
        SMSSender^ test = gcnew SMSSender();
        String^ resp = test->SendSMS("447777000000", "447777111111", "0", "1","myUsername", "myPassword","My test message");
        Console::WriteLine(resp);
        return 0;
}
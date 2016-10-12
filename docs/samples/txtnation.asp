<%@ language="JScript" %>
<%
    src="447777000000";
    dst="447777111111";
    type="0";
    dr="1";
    user="myUsername";
    pass="myPassword";
    message = Server.URLEncode("My test message");
    url = "http://smsc.txtnation.com:8091/sms/send_sms.php?" + "&src=" + src + "&dst=" + dst + "&type=" + type + "&dr=" + dr + "&user=" + user + "&password=" + pass + "&msg=" + message;
    var objSrvHTTP;
    objSrvHTTP = Server.CreateObject("Msxml2.ServerXMLHTTP");
    objSrvHTTP.open(url, false);
    objSrvHTTP.send();
    Response.ContentType = "text/xml";
    xmlResp = objSrvHTTP.responseXML.xml;
    Response.Write(xmlResp);
%>
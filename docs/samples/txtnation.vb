Imports System.Web

Module Module1
    Public Function SendSMS(ByVal src As String, ByVal dst As String, ByVal type As String, ByVal dr As String,
                            ByVal user As String, ByVal password As String, ByVal msg As String)
        Dim webClient As New System.Net.WebClient
        Dim url As String = "http://smsc.txtnation.com:8091/sms/send_sms.php?src=" &
                src & "&dst=" & dst & "&type=" & type & "&dr=" & dr & "&user=" & user & "&password=" & password
                "&msg=" & System.Web.HttpUtility.UrlEncode(msg)
        Dim result As String = webClient.DownloadString(url)
        SendSMS = result
    End Function

    Sub Main()
        Dim result As String = SendSMS("447777000000", "447777111111", "0", "1","myUsername", "myPassword","My test message")
        Console.WriteLine(result)
        Console.ReadKey()
    End Sub

End Module

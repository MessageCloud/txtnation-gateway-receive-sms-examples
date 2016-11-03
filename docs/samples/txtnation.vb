Imports System.Net
Imports System.Globalization

Module HttpListener

    Sub Main()
        Dim prefixes(0) As String
        prefixes(0) = "http://*:8080/HttpListener/"
        ProcessRequests(prefixes)
    End Sub

    Private Sub ProcessRequests(ByVal prefixes() As String)
        If Not System.Net.HttpListener.IsSupported Then
            Console.WriteLine( _
                "Windows XP SP2, Server 2003, or higher is required to use the HttpListener class.")
            Exit Sub
        End If

        ' URI prefixes are required,
        If prefixes Is Nothing OrElse prefixes.Length = 0 Then
            Throw New ArgumentException("prefixes")
        End If

        ' Create a listener and add the prefixes.
        Dim listener As System.Net.HttpListener = _
            New System.Net.HttpListener()
        For Each s As String In prefixes
            listener.Prefixes.Add(s)
        Next

        Try
            ' Start the listener to begin listening for requests.
            listener.Start()
            Console.WriteLine("Listening...")
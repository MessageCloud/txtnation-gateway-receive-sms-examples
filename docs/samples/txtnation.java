import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * This program is a very simple Web server. When it receives a HTTP request it sends a simple OK response.
 */
public class HttpListener {
	public static void main(String args[]) {
    	try {
      
			// Get the port to listen on
			int port = Integer.parseInt(args[0]);

			// Create a ServerSocket to listen on that port.
			ServerSocket ss = new ServerSocket(port);

			// Now enter an infinite loop, waiting for & handling connections.
			for (;;) {
			
				// Wait for a client to connect. The method will block;
				// when it returns the socket will be connected to the client
				Socket client = ss.accept();

				// Get input and output streams to talk to the client
				BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter out = new PrintWriter(client.getOutputStream());

				// Start sending our reply, using the HTTP 1.1 protocol
				out.print("HTTP/1.1 200 \r\n");
				out.print("Content-Type: text/plain\r\n");
				out.print("Connection: close\r\n"); 
				out.print("\r\n");
				out.print("OK");

				// Now, read the HTTP request from the client. When we see the empty line, we stop reading.
				String line;
				while ((line = in.readLine()) != null) {
					if (line.length() == 0)
						break;
					// do something with line data here
				}

				// Flush and close the output stream
				out.close(); 
				
				// Close the input stream
				in.close(); 
				
				// Close the socket itself
				client.close(); 
			}
		}
			
		// If anything goes wrong, print an error message
		catch (Exception e) {
			System.err.println(e);
			System.err.println("Usage: java HttpListener <port>");
		}
	}
}
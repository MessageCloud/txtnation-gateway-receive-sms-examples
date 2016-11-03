# Get sockets from stdlib
require 'socket'               

# Socket to listen on port 8080
server = TCPServer.open(8080)			
	
# Servers run forever
loop {                       

	# Wait for a client to connect
	client = server.accept       
	
	# In this case, method = "POST" and path = "/"			
  	method, path = client.gets.split                    
  	headers = {}
	
	# Collect HTTP headers
  	while line = client.gets.split(' ', 2)        
	
		# Blank line means no more headers
    	break if line[0] == ""              
		
		# Hash headers by type              
    	headers[line[0].chop] = line[1].strip             
  	end
	
	# Read the POST data as specified in the header
  	data = client.read(headers["Content-Length"].to_i)  

	# Do what you want with the POST data
  	puts data                                           

  	# Send response to the client
  	client.puts "OK"
	
	# Disconnect from the client
  	client.close                 
}
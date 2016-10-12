require 'net/http'
require 'uri'

def send_sms(src, dst, type, dr, user, password, msg)
	requested_url = 'http://smsc.txtnation.com:8091/sms/send_sms.php?' +
		"&src=" + src + "&dst=" + dst +
		"&dr=" + dr + "&user=" + user + 
		"&password=" + password + "&type=" + type + "&msg=" + URI.escape(message) +
	url = URI.parse(requested_url)
	full_path = (url.query.blank?) ? url.path : "#{url.path}?#{url.query}"
	the_request = Net::HTTP::Get.new(full_path)
	the_response = Net::HTTP.start(url.host, url.port) { |http|
		http.request(the_request)
	}
	raise "Response was not 200, response was #{the_response.code}" if the_response.code != "200"
	return the_response.bodyend
resp = send_sms('447777000000', '447777111111', '0', '1','myUsername', 'myPassword','My test message')

puts(resp)
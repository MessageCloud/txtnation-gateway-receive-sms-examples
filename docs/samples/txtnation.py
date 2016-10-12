import urllib.parse
import urllib.request

url = 'http://smsc.txtnation.com:8091/sms/send_sms.php'
values = {
	'src' : 447777000000,
	'dst' : 447777111111,
	'type' : 0,
	'dr' : 1,
	'user': 'myUsername',
	'password' : 'myPassword',
	'msg' : 'My test message.' 
}
data = urllib.parse.urlencode(values).encode("utf-8")
req = urllib.request.Request(url, data)
response = urllib.request.urlopen(req)
the_page = response.read()
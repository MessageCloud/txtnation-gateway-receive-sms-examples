var http = require('http');

function getTestPersonaLoginCredentials(callback) {

    return http.get({
        host: 'http://smsc.txtnation.com',
        path: '/sms/send_sms.php',
        port: 8091,
        qs:{
          src:447777000000,
          dst:447777111111,
          dr:0,
          user:'myUsername',
          password: 'myPassword',
          type:1,
          msg:'test message'
        }
    }, function(response) {
        // Continuously update stream with data
        var body = '';
        response.on('data', function(d) {
            body += d;
        });
        response.on('end', function() {
            callback(body);
        });
    });

}
<?php

// Simple SMS send function
function sendSMS($src, $dst, $type, $dr, $user, $password, $msg) {
    $URL = 'http://smsc.txtnation.com:8091/sms/send_sms.php'."?src=$src&dst=$dst";
    $URL .= '&dr=$dr'.'&user=$username'.'&password=$password'.'&type=$type';
    $URL .= "msg=".urlencode($message).;
    $fp = fopen($URL, 'r');
    return fread($fp, 1024);
}
// Example of use
$response = sendSMS('447777000000', '447777111111', '0','myUsername', 'myPassword','My test message');
echo $response;
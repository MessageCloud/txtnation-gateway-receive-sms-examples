<?php

foreach ($_POST as $key => $value) 
{
    echo $key . '=' . var_dump($value) . '<br />';
}
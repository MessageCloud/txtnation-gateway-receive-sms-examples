## Synopsis

This is a repository of sample code for the txtNation API at http://wiki.txtnation.com/wiki/Gateway_HTTP_XML#Bulk_SMS listening for an incoming MO POST request. 

## Code Example

Code samples are provided in the samples directory at [docs/samples](docs/samples) and can be used directly in their native language.

## Motivation

The repository has been written to provide a central version controlled storage location, for running an embeddable responsive iframe using GitHub pages with the purpose of embedding into several txtNation support websites.

## Widget Setup

The widget runs using GitHub pages which is pointed to the 'docs' folder and can be found at https://messagecloud.github.io/txtnation-gateway-receive-sms-examples/. The widget consists of a main widget.html file, and widget.js file. 

The main HTML file loads [Font Awesome](http://fontawesome.io/), [Bootstrap](http://getbootstrap.com/) and [jQuery](https://jquery.com/) via a CDN provided by [MaxCDN](https://www.maxcdn.com).

Jekyll's native syntax highlighter is used to highlight the code within the widget and is configured via the _config.yml file.

A modified jQuery library for iFrame resizing is used [davidjbradshaw/iframe-resizer](https://github.com/davidjbradshaw/iframe-resizer), in order to give the widget resizing capability using a JavaScript iFrame cross domain origin workaround. 

## Contributors

If you would like to contribute to this code, please open a pull request or get in touch via our website [www.txtnation.com](http://www.txtnation.com/contact-us/).

## License

The license is viewable in the LICENSE file included with this repository.
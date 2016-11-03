## Synopsis

This is a repository of sample code for the txtNation API at http://wiki.txtnation.com/wiki/Gateway_HTTP_XML#Bulk_SMS. 

## Code Example

Code samples are provided in the samples directory at [docs/samples](docs/samples) and can be used directly in their native language.

## Motivation

The repository has been written to provide a central version controlled storage location, for running an embeddable responsive iframe using GitHub pages with the purpose of embedding into several txtNation support websites.

## Widget Setup

The widget runs using GitHub pages which is pointed to the 'docs' folder. The widget consists of a main widget.html file, and widget.js file. 

The main HTML file loads [Font Awesome](http://fontawesome.io/), [Bootstrap](http://getbootstrap.com/) and [jQuery](https://jquery.com/) via a CDN provided by [MaxCDN](https://www.maxcdn.com).

Jekyll's native syntax highlighter is used to highlight the code within the widget and is configured via the _config.yml file.

A modified jQuery library for iFrame resizing is used [davidjbradshaw/iframe-resizer](https://github.com/davidjbradshaw/iframe-resizer), in order to give the widget resizing capability using a JavaScript iFrame cross domain origin workaround. 

## Contributors

If you would like to contribute to this code, please open a pull request or get in touch via our website [www.txtnation.com](http://www.txtnation.com/contact-us/).

## License

Copyright (c) 2002-2016 txtNation Limited.

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
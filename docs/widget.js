(function() {
		
	if (typeof loadJS == 'undefined') loadJS = new Array();
	if (typeof iFrameSize == 'undefined') iFrameSize = new Array();
	
	var random = Math.floor((Math.random() * 999999) + 1); 
	
	document.write('<iframe id="codeblock-' + random + '" src="https://txtnationsmsc.github.io/gateway-http-xml-mo/widget.html" width="100%" height="0" scrolling="no" marginheight="0" marginwidth="0" frameborder="0"></iframe>');
	
	loadJS[random] = function(url, implementationCode, location)
	{
	    var scriptTag = document.createElement('script');
	    scriptTag.src = url;
	    scriptTag.onload = implementationCode;
	    scriptTag.onreadystatechange = implementationCode;
	    location.appendChild(scriptTag);
	};
	
	iFrameSize[random] = function()
	{
		iFrameResize({ }, document.getElementById('codeblock-' + random));
	}
	
	loadJS[random]('https://txtnationsmsc.github.io/gateway-http-xml-mo/iframe-resizer/js/iframeResizer.min.js', iFrameSize[random], document.body);
	
})();
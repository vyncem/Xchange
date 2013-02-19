$ -> 
	loadXMLDoc = ->
	  if window.XMLHttpRequest
	    # code for IE7+, Firefox, Chrome, Opera, Safari
	    xmlhttp = new XMLHttpRequest()
	  else 
	  	# code for IE6, IE5
	    xmlhttp = new ActiveXObject("Microsoft.XMLHTTP")
	    
	  xmlhttp.onreadystatechange = ->
	  	document.getElementById("myDiv").innerHTML=xmlhttp.responseText;;
	
	  xmlhttp.open "GET", "http://localhost:9000/rates", data 
	  xmlhttp.send()
  
(function() {
  $(function() {
    var loadXMLDoc;
    return loadXMLDoc = function() {
      var xmlhttp;
      if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
      } else {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
      }
      xmlhttp.onreadystatechange = function() {
        return document.getElementById("myDiv").innerHTML = xmlhttp.responseText;
      };
      xmlhttp.open("GET", "http://localhost:9000/rates", data);
      return xmlhttp.send();
    };
  });
}).call(this);

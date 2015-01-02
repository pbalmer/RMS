<!DOCTYPE html>
<html lang="en">
<%@include  file="head.html" %>
<body role="document">
	<%@include  file="navigation.html" %>
    <div class="container theme-showcase" role="main">
    	<div id="message" class="well">
    		Logged in!
    	</div>
	</div>
	
	<script>
	(function() {
		$.getJSON( "/RiskWatch/test" ).done(function( data ) {
		  var items = [];
		  $.each( data, function( key, val ) {
		    items.push( "<li id='" + key + "'><b>" + key + "</b> : " + val + "</li>" );
		  });
		 
		  $( "<ul/>", {
		    "class": "my-new-list",
		    html: items.join( "" )
		  }).appendTo( "#message" );
		});
	})();
	</script>
	<script>
		checkSession(true);
	</script>
</body>
</html>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
  <!-- Declare the two tag libraries used on this page -->
  <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
  <%@ taglib uri='http://java.sun.com/jsp/jstl/xml' prefix='x' %>

<!-- Import the RSS feed at the URL specified by feed -->
<!-- For example -->
<!-- http://sportsfilter.com/rss.cfm -->
<c:import url='${param.feed}' var='feedData'/>

<!-- Parse the RSS feed -->
<x:parse xml='${feedData}' var='feed'/>

<!-- Retrieve the channel element -->
<x:set select='$feed//rss//channel' var='channel'/>

<!-- Display the channel element's title -->
  <title><x:out select='$channel//title'/></title>
</head>

<body>

<!-- Display the channel element's link and title -->
<p>Headlines from <a href="<x:out select='$channel//link'/>">
<x:out select='$channel//title'/></a>

<!-- Loop through the item elements -->
<p><ul>
<x:forEach select='$feed//rss//channel//item'> 
   <!-- Display each element's link, title, description -->
   <!-- Descriptions may contain HTML. -->
   <li><a href="<x:out select='link'/>"><x:out select='title'/></a>:
<x:out select='description' escapeXml='false'/></li>
   <br>
</x:forEach>
</ul>

</body>
</html>

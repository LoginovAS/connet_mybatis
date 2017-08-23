<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
	<title>Node ${node.nodeId}</title>
</head>
<body>
	<h1>Single node with ID = ${node.nodeId}</h1>
	<h2>${node}</h2>
	<a href="<%= request.getContextPath() %>">home</a>
</body>
</html>
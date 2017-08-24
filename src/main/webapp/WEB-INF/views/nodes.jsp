<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
	<title>Nodes</title>
	<script type="text/javascript" src="ext-all.js"></script>
</head>
<body>
	<h1>Node List:</h1>
	<table>
		<c:forEach items="${nodes}" var="node">
			<tr>
			    <td>${node.nodeName}</td>
			    <td>${node.region}</td>
			    <td>${node.street}</td>
			    <td>${node.building}</td>
			    <td><a href="/edit/${node.nodeId}">Edit</td>
			    <td><a href="/delete/${node.nodeId}">Delete</td>
			</tr>
		</c:forEach>
	</table>
	<a href="node/add">New Node</a>
</body>
</html>
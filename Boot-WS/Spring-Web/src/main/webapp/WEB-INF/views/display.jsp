<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="/css/mystyles.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1 class="s1">



<table border=1>

<tr>
	<th>Id</th>
	<th>Name</th>
	<th>price</th>
	
</tr>

<tr>

<td>
	${product.prodId}
</td>

<td>
	${product.prodName}
</td>
<td>
	${product.price}
</td>
</tr>

</table>


</h1>
</body>
</html>
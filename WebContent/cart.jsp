<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items = "${cart}" var = "c">
		<tr>
			<td>商品名称:</td><td>${c.container.value().product.getProductName()}</td>
			<td>商品数量：</td><td>${c.container.value().getCount()}</td>
		</tr>
	</c:forEach>
	<a href = "products.jsp">返回购物页</a>
</body>
</html>
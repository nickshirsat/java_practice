<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Servlets Demo</title>
</head>
<body>

<% 
	int no1,no2,result = 0;
	no1 = 10;
	no2 = 20;
	result = no1 + no2;
	out.println("\n The result of addition from the scriptlet tags :\t" + result);
%>

<%!
	float area = 0.0f;
	int radius;

	float areaCircle(int r){
		this.radius = radius;
		area = 3.14f * r * r;
		return area;
	}
%>

Area of circle is : <%= areaCircle(2) %>
</body>
</html>
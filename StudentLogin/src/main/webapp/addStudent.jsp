<%@page import="studentdb.StudentData" %>

<jsp:useBean id ="stud" class="studentdb.Student"></jsp:useBean>
<jsp:setProperty property="*" name="stud" />

<%
	int status = StudentData.save(stud);
%>

<% 
	if(status > 0){
		response.sendRedirect("addSuccess.jsp");
	} else {
		response.sendRedirect("addFailure.jsp");
	}
%>
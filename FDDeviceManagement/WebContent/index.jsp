<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body bgcolor="#98FB98" style="margin: 0 auto;">
<div>
 <center>
  <s:form action="login" class="com.FDDM.action.LoginAction">
     <s:textfield name="username" label="User Name"></s:textfield>
     <s:password name="password" label="Password"></s:password>
     <s:submit value="Log In"></s:submit>
     <s:fielderror cssStyle="color: red">
     </s:fielderror>

 </s:form>
 </center>
 </div>

</body>
</html>
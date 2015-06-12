<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
   
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-10">
<img src="images/loginbkg.jpg" height="100%" width="100%"/></div>
<div id="Layer2" style="position: absolute; left: 500px; top: 170px;">
  
    <s:form action="login" theme="simple" cssStyle="width:320px; height:200px; font-family: Arial,sans-serif; font-size:1.2em; line-height:50pt; background-color:#EEE8AA; padding:20px 30px;border:2px;border-radius:25px; filter:alpha(opacity=80); -moz-opacity:0.8;-khtml-opacity: 0.8; opacity: 0.8;" class="com.FDDM.action.LoginAction">
    <td>User Name:&nbsp;</td><td><s:textfield  name="username" cssStyle="width:200px; height: 30px; font-weight: bold;font-size:1.2em;" label="User Name"></s:textfield>
     <td>Password:&nbsp;&nbsp;&nbsp;</td><td><s:password  name="password" cssStyle="width:200px; height: 30px; font-weight: bold;font-size:1.2em;;" label="Password"></s:password>
     <s:submit cssStyle="font-family:Arial,sans-serif; font-size:1.2em; width:310px; height:42px; align:center;" value="Log In"></s:submit><br/>
     <s:fielderror theme="simple" cssStyle="color:red"></s:fielderror>
     </s:form>

</div>

</body>
</html>
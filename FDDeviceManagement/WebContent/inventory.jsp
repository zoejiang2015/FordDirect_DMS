<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'inventory.jsp' starting page</title>
	</head>
    <style type="text/css">
    .style{text-align: center}
    </style>
	<body>
	<center>
		<table border="0.5px" width="800px" class="style" style="margin-top: 50px;">
		<tr><td colspan="7" background="../skin/images/frame/wbg.gif" style="height:25px; text-align:center"><strong>Current Inventory£º</strong></td></tr>
			<tr bgcolor="lightgreen">
			    <td>
					Device ID
				</td>
				<td>
					Brand
				</td>
				<td>
					Type
				</td>
				<td>
					Model
				</td>
				<td>
					Name
				</td>
				<td>
					OS
				</td>
				<td>
					Charge
				</td>
				<td>
					Cable
				</td>
			</tr>
			<s:iterator value="%{#session.dv}" var="dv">
    	<tr>
    	    <td align="center"><s:property value="#dv.id" /></td>
    		<td align="center"><s:property value="#dv.brand" /></td>
    		<td align="center"><s:property value="#dv.type" /></td>
    		<td align="center"><s:property value="#dv.model" /></td>
    		<td align="center"><s:property value="#dv.name" /></td>
    		<td align="center"><s:property value="#dv.os" /></td>
    		<td align="center"><s:property value="#dv.charge" /></td>
    		<td align="center"><s:property value="#dv.cable" /></td>
    		<td align="center"><a href='select.action?dvid=<s:property value="#dv.id" />'>select</a></td>
    	</tr>
    	</s:iterator>
		</table>
		</center>
	</body>
</html>
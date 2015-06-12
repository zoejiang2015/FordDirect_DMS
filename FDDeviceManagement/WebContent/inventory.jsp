<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'inventory.jsp' starting page</title>
		<script type="text/javascript" > 
     function  DeviceCount(n){ 
        var checkedCount=0; 
        for(var i=0;i<inventory.device.length ;i ++){ 
         if(inventory.device[i].checked){ 
          checkedCount++; 

       } 
   } 
    if(checkedCount>n){ 

  alert("One person can check out 3 devices at most!"); 
       return false; 

  } 
  } 

</script>
	</head>
    <style type="text/css">
    #inventory
    {
    font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
    width:100%;
    border-collapse:collapse;
    }
    
    #inventory td, #inventory th
    {
    font-size:1em;
    border:1px solid #98bf21;
    padding:3px 7px 2px 7px;
    }
    
    #inventory th
    {
    font-size:0.8em;
    text-align:left;
    padding-top:5px;
    padding-bottom:4px;
    background-color:#A7C942;
    color:#ffffff;
    }
    
    #inventory tr.alt td
    {
    color:#000000;
    background-color:#EAF2D3;
    }
    
    #inventory tr.disabledAnchor td{
       pointer-events: none !important;
       cursor: default;
       color:Gray;
     }
    </style>
	<body>
	<center>
		<form name="inventory" id="inventory" method="post" >
		 <table id="inventorytbl" width="1000">
		<tr><td colspan="9" style="font-size:1.1em; height:50px; text-align:center"><strong>Current Inventory£º</strong></td></tr>
			<tr>
				<th>
					Brand
				</th>
				<th>
					Type
				</th>
				<th>
					Model
				</th>
				<th>
					Name
				</th>
				<th>
					OS
				</th>
				<th>
					browser
				</th>
				<th>
					Charge
				</th>
				<th>
					Cable
				</th>
				<th>
					Operation
				</th>
			</tr>
			<s:iterator value="%{#session.dv}" var="dv">
    	<tr>
    	    
    		<td><s:property value="#dv.brand" /></td>
    		<td><s:property value="#dv.type" /></td>
    		<td><s:property value="#dv.model" /></td>
    		<td><s:property value="#dv.name" /></td>
    		<td><s:property value="#dv.os" /></td>
    		<td><s:property value="#dv.browser" /></td>
            <td><s:property value="#dv.charge" /></td>
            <td><s:property value="#dv.cable" /></td>
            <td><input  type="checkbox" name="device['<s:property value="#dv.id" />'-1]" value="<s:property value="#dv.id" />" onClick="return DeviceCount(3)">select</td>
<%--     		<td><a href='select.action?dvid=<s:property value="#dv.id" />'>select</a></td> --%>
    	</tr>
    	</s:iterator>
    	</table>
    	  <input type="submit" value="Check Out selected Devices">
           <input type="reset" value="Reset">
		</form>
		</center>
	</body>
</html>
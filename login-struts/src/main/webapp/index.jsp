<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>CZ3006 Advanced Software Engineering</title>
  </head>
  <body>
    <h1>CZ3006 Advanced Software Engineering</h1>
	<h2>Assignment 2 - Group 6</h2>
	<h3>AY2020-21 Semester 2</h3>
	<h1><s:property value = "errorMessage"/></h1>
	<s:form action="authenticateuser">  
	<s:textfield name="loginModel.username" label="Name"></s:textfield>  
	<s:password name="loginModel.password" label="Password"></s:password>  
	<s:submit value="Login"></s:submit>  
	</s:form> 
  </body>
</html>

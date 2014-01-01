<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<html:errors />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>

<body>
	<html:form action="/loginAction" method="post">
	<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td><bean:message key="login.form.username"/></td>
			<td><html:text property="uname"/></td>
		</tr>
		<tr>
			<td><bean:message key="login.form.password" /></td>
			<td><html:text property="password"/></td>
		</tr>		<tr>
			<td><html:submit value="Submit" /></td>
			<td><html:reset value="Reset" /></td>
		</tr>

	</table>
	</html:form>
</body>
</html:html>


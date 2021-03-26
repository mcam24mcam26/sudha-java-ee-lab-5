<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lab No. 5</title>
</head>
<body>
	<form action="ContactSave" method="post">
		<table>
			<tr>
				<td>Name: </td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Mobile: </td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>E_mail: </td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr><td><input type="submit" value = "SUBMIT"></td></tr>
		</table>
	</form>
</body>
</html>
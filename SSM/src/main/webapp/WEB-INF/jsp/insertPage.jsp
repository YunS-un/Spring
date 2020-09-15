<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
	</head>
	<body>
		<form action="insertSubmit.do" method="post">
			<table>
				<tr>
					<td><label for="bookName">书名</label></td>
					<td><input type="text" id="bookName" name="bookName"></td>
				</tr>
				<tr>
					<td><label for="bookPrice">价格</label></td>
					<td><input type="text" id="bookPrice" name="bookPrice"></td>
				</tr>
				<tr>
					<td><label for="bookAuthor">作者</label></td>
					<td><input type="text" id="bookAuthor" name="bookAuthor"></td>
				</tr>
				<tr>
					<td><label for="bookPages">页数</label></td>
					<td><input type="text" id="bookPages" name="bookPages"></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="添加">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>

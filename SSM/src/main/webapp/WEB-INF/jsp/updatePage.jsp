<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
	</head>
	<body>
		<form:form action="updateSubmit.do" method="post" modelAttribute="book">
			<input type="hidden" name="bookId" value="${book.bookId}">
			<table>
				<tr>
					<td><form:label path="bookName">书名</form:label></td>
					<td><form:input path="bookName"/></td>
				</tr>
				<tr>
					<td><form:label path="bookPrice">价格</form:label></td>
					<td><form:input path="bookPrice"/></td>
				</tr>
				<tr>
					<td><form:label path="bookAuthor">作者</form:label></td>
					<td><form:input path="bookAuthor"/></td>
				</tr>
				<tr>
					<td><form:label path="bookPages">页数</form:label></td>
					<td><form:input path="bookPages"/></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="修改">
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>

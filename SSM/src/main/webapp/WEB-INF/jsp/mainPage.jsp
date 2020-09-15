<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
	</head>
	<body>
		<table>
			<tr>
				<td>编号</td>
				<td>书名</td>
				<td>价格</td>
				<td>作者</td>
				<td>页数</td>
				<th>操作</th>
			</tr>
			<c:forEach items="${list}" var="book">
				<tr>
					<td>${book.bookId}</td>
					<td>${book.bookName}</td>
					<td>${book.bookPrice}</td>
					<td>${book.bookAuthor}</td>
					<td>${book.bookPages}</td>
					<td>
						<a href="deleteSubmit.do?bookId=${book.bookId}">删除</a>
						<a href="updatePage.do?bookId=${book.bookId}">修改</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<a href="insertPage.do">添加</a>
	</body>
</html>

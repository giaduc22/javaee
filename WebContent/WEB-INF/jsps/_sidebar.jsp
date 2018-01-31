
<%@page import="com.giaduc.java4.model.Author"%>
<%@page import="com.giaduc.java4.dao.AuthorDao"%>
<%@page import="com.giaduc.java4.model.Category"%>
<%@page import="java.util.List"%>
<%@page import="com.giaduc.java4.dao.CategoryDao"%>
<div class="single-sidebar">
	<h2 class="sidebar-title">Categories</h2>
	<ul>
		<%
			CategoryDao categoryDao = new CategoryDao();
			List<Category> categories = categoryDao.getAllCategory();
			for (int i = 0; i < categories.size(); i++) {
				String categoryName = categories.get(i).getName();
		%>
		<li><a href="shop?cate=<%= categories.get(i).getId() %>"><%=categoryName%></a>
		</li>
		<%
			}
		%>
	</ul>
</div>

<div class="single-sidebar">
	<h2 class="sidebar-title">Authors</h2>
	<ul>
		<%
			AuthorDao authorDao = new AuthorDao();
			List<Author> authors = authorDao.getAllAuthor();
			for (int i = 0; i < authors.size(); i++) {
				String authorName = authors.get(i).getName();
		%>
		<li><a href="shop?author=<%= authors.get(i).getId() %>"><%=authorName%></a></li>
		<%
			}
		%>
	</ul>
</div>

<div class="single-sidebar">
	<h2 class="sidebar-title">Best seller</h2>
	<div class="thubmnail-recent">
		<img src="img/book1.jpg" class="recent-thumb" alt="">
		<h2>
			<a href="single-product.html">Book title</a>
		</h2>
		<div class="product-sidebar-price">
			<ins>$700.00</ins>
			<del>$100.00</del>
		</div>
	</div>
	<div class="thubmnail-recent">
		<img src="img/book1.jpg" class="recent-thumb" alt="">
		<h2>
			<a href="single-product.html">Book title</a>
		</h2>
		<div class="product-sidebar-price">
			<ins>$700.00</ins>
			<del>$100.00</del>
		</div>
	</div>
	<div class="thubmnail-recent">
		<img src="img/book1.jpg" class="recent-thumb" alt="">
		<h2>
			<a href="single-product.html">Book title</a>
		</h2>
		<div class="product-sidebar-price">
			<ins>$700.00</ins>
			<del>$100.00</del>
		</div>
	</div>
	<div class="thubmnail-recent">
		<img src="img/book1.jpg" class="recent-thumb" alt="">
		<h2>
			<a href="single-product.html">Book title</a>
		</h2>
		<div class="product-sidebar-price">
			<ins>$700.00</ins>
			<del>$100.00</del>
		</div>
	</div>
</div>


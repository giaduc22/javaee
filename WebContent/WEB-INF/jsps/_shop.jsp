<%@page import="com.giaduc.java4.model.Book"%>
<%@page import="com.giaduc.java4.dao.BookDao"%>
<%@page import="com.giaduc.java4.model.Author"%>
<%@page import="com.giaduc.java4.dao.AuthorDao"%>
<%@page import="com.giaduc.java4.model.Category"%>
<%@page import="java.util.List"%>
<%@page import="com.giaduc.java4.dao.CategoryDao"%>
<div class="single-product-area">
	<div class="zigzag-bottom"></div>
	<div class="container">
		<div class="row">
			<div class="col-md-2">
				<jsp:include page="_sidebar.jsp"></jsp:include>
			</div>
			<div class="col-md-10">

				<%
					BookDao bookDao = new BookDao();
					List<Book> books = null;

					/* Get page, cate, author param */
					int pageNum = 0;
					int cateId = 0;
					int authorId = 0;
					int lastPageNumber = 0;
					String pageParam = request.getParameter("page");
					String cateParam = request.getParameter("cate");
					String authorParam = request.getParameter("author");

					/* 
						- Neu cateParam = null, authorParam = null:
							lastPageNumber = query all;
							getBookByPage();
						- Neu cateParam = null, authorParam != null:
							lastPageNumber = query all by author;
							getBookByAuthor();
						- Neu cateParam != null, authorParam = null;
							lastPageNumber = query all by cate;
							getBookByCate();
					*/

					if (null == pageParam && null == cateParam && null == authorParam) {
						pageNum = 1;
						books = bookDao.getBookByPage(pageNum);
						lastPageNumber = bookDao.lastPageNumber("all", 0, 0);
					} else if (null != pageParam && null == cateParam && null == authorParam) {
						pageNum = Integer.parseInt(pageParam);
						books = bookDao.getBookByPage(pageNum);
						lastPageNumber = bookDao.lastPageNumber("all", 0, 0);
					} else if (null == cateParam && null != authorParam) {
						if (null == pageParam) {
							pageNum = 1;
						} else {
							pageNum = Integer.parseInt(pageParam);
						}
						authorId = Integer.parseInt(authorParam);
						books = bookDao.getBookByAuthor(authorId, pageNum);
						lastPageNumber = bookDao.lastPageNumber("author", 0, authorId);
					} else if (null != cateParam && null == authorParam) {
						if (null == pageParam) {
							pageNum = 1;
						} else {
							pageNum = Integer.parseInt(pageParam);
						}
						cateId = Integer.parseInt(cateParam);
						books = bookDao.getBookByCate(cateId, pageNum);
						lastPageNumber = bookDao.lastPageNumber("category", cateId, 0);
					}

					for (int i = 1; i < books.size(); i++) {
						String bookTitle = books.get(i).getTitle();
						String bookImage = books.get(i).getImage();
						int bookId = books.get(i).getId();
				%>

				<div class="col-md-3 col-sm-6">
					<div class="single-product">
						<div class="product-f-image">
							<img src="img/<%=bookImage%>.jpg" alt="">
							<div class="product-hover">
								<a href="#" class="add-to-cart-link"><i
									class="fa fa-shopping-cart"></i> Add to cart</a> <a
									href="single-product.html" class="view-details-link"><i
									class="fa fa-link"></i> See details</a>
							</div>
						</div>

						<h2>
							<a href="single-product.html"><%=bookTitle%></a>
						</h2>

						<div class="product-carousel-price">
							<ins>$700.00</ins>
							<del>$100.00</del>
						</div>
					</div>
				</div>


				<%
					}
				%>


			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<div class="product-pagination text-center">
					<nav>
						<ul class="pagination">


							<%
								for (int i = 1; i <= lastPageNumber; i++) {
									if ((null == pageParam || null != pageParam) && null == cateParam && null == authorParam) {
							%>
										<li><a href="shop?page=<%=i%>"><%=i%></a></li>
								<%
									} else if(null != cateParam){
								%>
									<li><a href="shop?cate=<%= cateId %>&page=<%=i%>"><%=i%></a></li>
								<%
									} else if(null != authorParam){
								%>
									<li><a href="shop?author=<%= authorId %>&page=<%=i%>"><%=i%></a></li>
							<%
									}
								}
							%>

						</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>
</div>
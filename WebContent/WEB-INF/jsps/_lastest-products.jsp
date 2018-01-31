
<%@page import="com.giaduc.java4.model.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.giaduc.java4.dao.BookDao"%>
<div class="maincontent-area">
	<div class="zigzag-bottom"></div>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="latest-product">
					<h2 class="section-title">Latest Products</h2>
					<div class="product-carousel">
					
						<% 
							BookDao bookDao = new BookDao();
							List<Book> books = bookDao.getAllBook();
							for(int i = 1; i < books.size(); i++){
								String bookTitle = books.get(i).getTitle();
								String bookImage = books.get(i).getImage();
								int bookId = books.get(i).getId();
							
						%>
					
							<div class="single-product">
								<div class="product-f-image">
									<img src="img/<%= bookImage %>.jpg" alt="">
									<div class="product-hover">
										<a href="addtocart?id=<%= bookId%>" class="add-to-cart-link"><i
											class="fa fa-shopping-cart"></i> Add to cart</a> <a
											href="detail?id=<%= bookId %>" class="view-details-link"><i
											class="fa fa-link"></i> See details</a>
									</div>
								</div>
	
								<h2>
									<a href="detail?id=<%= bookId %>"><%= bookTitle %></a>
								</h2>
	
								<div class="product-carousel-price">
									<ins>$700.00</ins>
									<del>$100.00</del>
								</div>
							</div>
						
						<%
							}
						%>
						
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- End main content area -->

 

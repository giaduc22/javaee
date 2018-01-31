<%@page import="com.giaduc.java4.dao.CategoryDao"%>
<%@page import="com.giaduc.java4.model.Category"%>
<%@page import="com.giaduc.java4.model.Book"%>
<%@page import="com.giaduc.java4.dao.BookDao"%>

<%
	CategoryDao categoryDao = new CategoryDao();
	Book book = new Book();
	BookDao bookDao = new BookDao();
	int queryId = Integer.parseInt(request.getParameter("id"));
	book = bookDao.getOneBook(queryId);
	String bookTitle = book.getTitle();
	String bookImage = book.getImage();
%>


<div class="single-product-area">
	<div class="zigzag-bottom"></div>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="product-content-right">
					<nav aria-label="breadcrumb">
					  <ol class="breadcrumb">
					    <li class="breadcrumb-item"><a href="#">Home</a></li>
					    <li class="breadcrumb-item"><a href="#"><%=categoryDao.getOneCategory(book.getCategory()).getName()%></a></li>
					    <li class="breadcrumb-item active" aria-current="page"><%=book.getTitle()%></li>
					  </ol>
					</nav>
					<div class="row">
						<div class="col-sm-4">
							<div class="product-images">
								<div class="product-main-img">
									<img src="img/<%=bookImage%>.jpg" alt="">
								</div>
							</div>
						</div>

						<div class="col-sm-8">
							<div class="product-inner">
								<h2 class="product-name"><%=bookTitle%></h2>
								<div class="product-inner-price">
									<ins>$700.00</ins>
									<del>$100.00</del>
								</div>

								<form action="" class="cart">
									<div class="quantity">
										<input type="number" size="4" class="input-text qty text"
											title="Qty" value="1" name="quantity" min="1" step="1">
									</div>
									<button class="add_to_cart_button" type="submit">Add
										to cart</button>
								</form>

								<div class="product-inner-category">
									<p>
										Category: <a href=""><%=categoryDao.getOneCategory(book.getCategory()).getName()%></a>.
										Author: <a href="">awesome</a>, <a href="">best</a>, <a
											href="">sale</a>, <a href="">shoes</a>.
									</p>
								</div>

								<div role="tabpanel">
									<ul class="product-tab" role="tablist">
										<li role="presentation" class="active"><a href="#home"
											aria-controls="home" role="tab" data-toggle="tab">Description</a></li>
										<li role="presentation"><a href="#profile"
											aria-controls="profile" role="tab" data-toggle="tab">Reviews</a></li>
									</ul>
									<div class="tab-content">
										<div role="tabpanel" class="tab-pane fade in active" id="home">
											<h2>Product Description</h2>
											<p>Lorem ipsum dolor sit amet, consectetur adipiscing
												elit. Nam tristique, diam in consequat iaculis, est purus
												iaculis mauris, imperdiet facilisis ante ligula at nulla.
												Quisque volutpat nulla risus, id maximus ex aliquet ut.
												Suspendisse potenti. Nulla varius lectus id turpis dignissim
												porta. Quisque magna arcu, blandit quis felis vehicula,
												feugiat gravida diam. Nullam nec turpis ligula. Aliquam quis
												blandit elit, ac sodales nisl. Aliquam eget dolor eget elit
												malesuada aliquet. In varius lorem lorem, semper bibendum
												lectus lobortis ac.</p>

											<p>Mauris placerat vitae lorem gravida viverra. Mauris in
												fringilla ex. Nulla facilisi. Etiam scelerisque tincidunt
												quam facilisis lobortis. In malesuada pulvinar neque a
												consectetur. Nunc aliquam gravida purus, non malesuada sem
												accumsan in. Morbi vel sodales libero.</p>
										</div>
										<div role="tabpanel" class="tab-pane fade" id="profile">
											<h2>Reviews</h2>
											<div class="submit-review">
												<p>
													<label for="name">Name</label> <input name="name"
														type="text">
												</p>
												<p>
													<label for="email">Email</label> <input name="email"
														type="email">
												</p>
												<div class="rating-chooser">
													<p>Your rating</p>

													<div class="rating-wrap-post">
														<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
															class="fa fa-star"></i> <i class="fa fa-star"></i> <i
															class="fa fa-star"></i>
													</div>
												</div>
												<p>
													<label for="review">Your review</label>
													<textarea name="review" id="" cols="30" rows="10"></textarea>
												</p>
												<p>
													<input type="submit" value="Submit">
												</p>
											</div>
										</div>
									</div>
								</div>

							</div>
						</div>
					</div>



				</div>
			</div>

		</div>
	</div>
</div>


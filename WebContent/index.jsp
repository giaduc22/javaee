<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<% 
	final String SHOP_PAGE = "/shop";
	final String DETAIL_PAGE = "/detail";
	final String LOGIN_PAGE = "/login";
	final String REGISTER_PAGE = "/register";
	final String CART_PAGE = "/cart";
%>	
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>

<!-- Google Fonts -->
<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.min.css">

<!-- Font Awesome -->
<!-- <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet"> -->
<link href="css/fontawesome-all.css" rel="stylesheet">

<!-- Custom CSS -->
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/responsive.css">

</head>
<body>
	<jsp:include page="WEB-INF/jsps/_header.jsp"></jsp:include>
	<jsp:include page="WEB-INF/jsps/_brand.jsp"></jsp:include>
	<jsp:include page="WEB-INF/jsps/_menu.jsp"></jsp:include>
	
	
	<!-- CONTENT -->
		<%
			if(DETAIL_PAGE.equals(request.getAttribute("path"))){
		%>
				<jsp:include page="WEB-INF/jsps/_detail.jsp"></jsp:include>
		<%	
			} else if(CART_PAGE.equals(request.getAttribute("path"))){
				%>
					<jsp:include page="WEB-INF/jsps/_cart.jsp"></jsp:include>
				<%	
				
			} else if(LOGIN_PAGE.equals(request.getAttribute("path"))){
				%>
					<jsp:include page="WEB-INF/jsps/_login.jsp"></jsp:include>
				<%	
				
			} else if(REGISTER_PAGE.equals(request.getAttribute("path"))){
				%>
					<jsp:include page="WEB-INF/jsps/_register.jsp"></jsp:include>
				<%	
				
			} else if(SHOP_PAGE.equals(request.getAttribute("path"))){
				%>
					<jsp:include page="WEB-INF/jsps/_shop.jsp"></jsp:include>
				<%	
				
			}
			
			
			else {
		%>
			<jsp:include page="WEB-INF/jsps/_slide.jsp"></jsp:include>
			<jsp:include page="WEB-INF/jsps/_lastest-products.jsp"></jsp:include>
			<jsp:include page="WEB-INF/jsps/_product-widget.jsp"></jsp:include>
		<%
			}
		%>
	<!-- END CONTENT -->
	
	<jsp:include page="WEB-INF/jsps/_footer.jsp"></jsp:include>
	
	<!-- Latest jQuery form server -->
    <script src="https://code.jquery.com/jquery.min.js"></script>
    
    <!-- Bootstrap JS form CDN -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    
    <!-- jQuery sticky menu -->
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.sticky.js"></script>
    
    <!-- jQuery easing -->
    <script src="js/jquery.easing.1.3.min.js"></script>
    
    <!-- Main Script -->
    <script src="js/main.js"></script>
    
    <!-- Slider -->
    <script type="text/javascript" src="js/bxslider.min.js"></script>
	<script type="text/javascript" src="js/script.slider.js"></script>
</body>
</html>
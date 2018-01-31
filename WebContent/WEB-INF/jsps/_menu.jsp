<%@page import="com.giaduc.java4.model.Category"%>
<%@page import="java.util.List"%>
<%@page import="com.giaduc.java4.dao.CategoryDao"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="mainmenu-area">
        <div class="container">
            <div class="row">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div> 
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="./">Home</a></li>
                    </ul>
                    <ul class="nav navbar-nav">
                        <li><a href="shop">Shop page</a></li>
                    </ul>
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                        	<a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false" href="#">
                       			Category
                       			<b class="caret"></b>               		
                        	</a>
                        	<ul class="dropdown-menu">
                        		<%
                        			CategoryDao categoryDao = new CategoryDao();
                        			List<Category> categories = categoryDao.getAllCategory();
                        			for(int i = 0; i < categories.size(); i++){
                        				String categoryName = categories.get(i).getName();
                        		%>
                        			<li>
		                       			<a href="#"><%= categoryName %></a>
		                       		</li>
                        		<%
                        			}
                        		%>
                        		
                        		
                        	</ul>
                        </li>
                    </ul>
               		<ul class="nav navbar-nav">
                        <li><a href="#">About us</a></li>
                    </ul>
                    <ul class="nav navbar-nav">
                        <li><a href="#">Contact</a></li>
                    </ul>
                </div>  
            </div>
        </div>
    </div> <!-- End mainmenu area -->
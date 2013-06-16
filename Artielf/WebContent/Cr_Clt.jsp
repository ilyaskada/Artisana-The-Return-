<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="css/images/favicon.ico" />
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
	<!--[if IE 6]>
		<link rel="stylesheet" href="css/ie6.css" type="text/css" media="media" />
		<script src="js/png-fix.js" type="text/javascript" charset="utf-8"></script>
	<![endif]-->
	<script src="js/jquery-1.6.2.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/jquery.jcarousel.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/jquery-func.js" type="text/javascript" charset="utf-8"></script>
<title>Gestion Client</title>
</head>
<body>
<div id="wrapper">
		<!-- Header -->
		<div id="top">
			<!-- Shell -->
			<div class="shell">
				

<div class="top-nav">

<ul>



 <li class="first nobg">

					    <li><a href="Compte.jsp" title="Login">Login</a></li>

					    <li><a href="Compte.html" title="My Account">Mon compte</a></li>

					   

					    <li class="nobg"><a href="Panier.jsp" class="Panier" title="My Bag">Panier</a></li>
					</ul>
				</div>
				<div id="search">
					<form action="" method="post">
						<input type="text" class="field" value="Rechercher" title="" />
					</form>
				</div>
				<div class="cl">&nbsp;</div>
			</div>
			<!-- End Shell -->
		</div>
		<div id="main">
			<!-- Shell -->
			<div class="shell">
				<!-- Header -->
				<div id="header">
					<h1 id="logo"><a href="#" class="notext" title="Shopper Friend">Artisanat Blog</a></h1>
					<div id="navigation">
						<ul>
						    <li><a href="home.html" class="active" title="For Boys"><span>Accueil</span></a></li>
		

				 

   <li><a href="#" title="For Girls"><span>Catalogue</span></a></li>
						    <li><a href="Catalogue.html" title="Common"><span>Présentation</span></a></li>
						</ul>
					</div>
					<div class="cl">&nbsp;</div>
				</div>
		<table id="Inscription">
	<tr><td><a href="Cr_Clt.jsp?op=add"><legend><strong>Ajouter</legend></strong> </a></td></tr>
	<tr><td><a href="CltCtrl?operation=cslt"><legend><strong>Tous les Client :</legend></strong></a></td></tr>
	</table>
	
	<c:set var="operation" value="${param.op }"/>
	<c:choose>
		<c:when test="${operation=='add' }">
		<form action="CltCtrl?operation=add"  method="post">	
		<table id="Inscription">
		
		<tr><td>id</td><td><input type="text" name="n" ></td></tr>
		<tr><td>Email</td><td><input type="email" name="e" ></td></tr>
		<tr><td>Login</td><td><input type="text" name="l" ></td></tr>

		<tr><td>Password</td><td><input type="password" name="p" ></td></tr>

		<tr><td><input  class="enregistrer" type="submit"></td></tr>
		</table>
		</c:when>
		<c:when test="${operation=='cslt' }">
			<table id="Inscription">
				<tr><td>Nom</td><td>Email</td><td>LoGin</td><td>PassWord</td><td>Operation 1</td><td>Operation 2</td></tr>
				<%
					String s=(String)request.getAttribute("ss");
				out.print(s);
				%>
			</table>
		</c:when>
		<c:when test="${operation=='mod' }">
		<form action="CltCtrl?operation=validmod&id=${id }"  method="post">	
		<table id="Inscription">
		
		<tr><td>id</td><td><input type="text" name="n" value="${a }" ></td></tr>
		<tr><td>Email</td><td><input type="email" name="e" value="${b }" ></td></tr>
		<tr><td>Login</td><td><input type="text" name="l" value="${c }"></td></tr>

		<tr><td>Password</td><td><input type="password" name="p" value="${d }" ></td></tr>

		<tr><td><input class="enregistrer" type="submit"></td></tr>
		</table>
		</c:when>
	</c:choose>
	<div id="footer-push" class="cl">&nbsp;</div>
	</div>
	<div id="footer">
		<!-- Shell -->
		<div class="shell">
			<!-- Cols -->
			<div class="cols">
				
				<div class="cl">&nbsp;</div>
			</div>
			<!-- End Cols -->
			<p class="copy">&copy; Qualité Logiciel 2013</p>
			
			<div class="cl">&nbsp;</div>
		</div>
		<!-- End Shell -->
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en-US" xmlns="http://www.w3.org/1999/xhtml" dir="ltr">
<head>
	<title>CSS Free Templates with jQuery Slider</title>
	<script src="http://code.jquery.com/jquery-1.9.1.js"></script>

  <link rel="stylesheet" href="style.css" />
  <LINK REL=StyleSheet HREF="style2.css" TYPE="text/css" MEDIA=screen>
  	<script>
$(document).ready(function () {
  $('#nav > li > a').click(function(){
    if ($(this).attr('class') != 'active'){
      $('#nav li ul').slideUp();
      $(this).next().slideToggle();
      $('#nav li a').removeClass('active');
      $(this).addClass('active');
    }
  });
});
	</script>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<link rel="shortcut icon" href="css/images/favicon.ico" />
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
	<!--[if IE 6]>
		<link rel="stylesheet" href="css/ie6.css" type="text/css" media="media" />
		<script src="js/png-fix.js" type="text/javascript" charset="utf-8"></script>
	<![endif]-->
	<script src="js/jquery-1.6.2.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/jquery.jcarousel.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/jquery-func.js" type="text/javascript" charset="utf-8"></script>	
</head>
<body>
	<!-- Wrapper -->
	<div id="wrapper">
		<!-- Header -->
		<div id="top">
			<!-- Shell -->
			<div class="shell">
				

<div class="top-nav">

<ul>



 <li class="first nobg">

					    <li><a href="FormInscription.jsp" title="Login">Login</a></li>

					    <li><a href="Compte.jsp" title="My Account">Mon compte</a></li>

					   

					    <li class="nobg"><a href="Panier.jsp" class="Panier" title="My Bag">Panier</a></li>
					</ul>
				</div>
				<div id="search">
					<form action="" method="post">
						<input type="text" class="field" value="Quick search..." title="Quick search..." />
					</form>
				</div>
				<div class="cl">&nbsp;</div>
			</div>
			<!-- End Shell -->
		</div>
		<!-- End Top -->
		<!-- Main -->
		<div id="main">
		<ul id="nav">


		</ul>
 
			<!-- Shell -->
			<div class="shell">
				<!-- Header -->
				<div id="header">
					<h1 id="logo"><a href="#" class="notext" title="Artisanat Blog">Artisanat Blog</a></h1>
					<div id="navigation">
						<ul>
						    <li><a href="home.jsp" class="active" title="For Boys"><span>Accueil</span></a></li>
		

				 

   <li><a href="Catalogue.jsp" title="For Girls"><span>Catalogue</span></a></li>
						    <li><a href="#" title="Common"><span>Présentation</span></a></li>
						</ul>
					</div>
					
					<div class="nav">
						<a href="#" title="First Slide">&nbsp;</a>
						<a href="#" title="Second Slide">&nbsp;</a>
						<a href="#" title="Third Slide">&nbsp;</a>
					</div>
				</div>
				<!-- End Slider -->
				<!-- Content -->
				<div id="content">
					<!-- Case -->
					<div class="case">
						




<h3></h3>
	


					<!-- Row -->
						<div class="row">
							<ul>
							    <li>
									<a href="#" class="product" title="Product 1">
										<img src="css/images/product-1.jpg" alt="Product Image 1" />
										<span class="order model">Model Name</span>
										<span class="order">catalog number: <span class="number">1925</span></span>
										<span class="order"><span class="buy-text">Buy Now</span><span class="price"><span class="dollar">$</span>599<span class="sub-text">.99</span></span></span>
									</a>
							    </li>
							    <li>
									<a href="#" class="product" title="Product 2">
										<img src="css/images/product-2.jpg" alt="Product Image 2" />
										<span class="order model">Model Name</span>
										<span class="order">catalog number: <span class="number">1357</span></span>
										<span class="order"><span class="buy-text">Buy Now</span><span class="price"><span class="dollar">$</span>1999<span class="sub-text">.99</span></span></span>
									</a>	
							    </li>
							    <li>
									<a href="#" class="product" title="Product 3">
										<img src="css/images/product-3.jpg" alt="Product Image 3" />
										<span class="order model">Model Name</span>
										<span class="order">catalog number: <span class="number">1264</span></span>
										<span class="order"><span class="buy-text">Buy Now</span><span class="price"><span class="dollar">$</span>15<span class="sub-text">.99</span></span></span>
									</a>	
							    </li>
							    <li>
									<a href="#" class="product" title="Product 4">
										<img src="css/images/product-4.jpg" alt="Product Image 4" />
										<span class="order model">Model Name</span>
										<span class="order">catalog number: <span class="number">1111</span></span>
										<span class="order"><span class="buy-text">Buy Now</span><span class="price"><span class="dollar">$</span>1999<span class="sub-text">.99</span></span></span>
									</a>	
							    </li>
							</ul>
							<div class="cl">&nbsp;</div>
						</div>
						<!-- End Row -->
						<!-- Row -->
						<div class="row last-row">
							<ul>
							    <li>
									<a href="#" class="product" title="Product 5">
										<img src="css/images/product-5.jpg" alt="Product Image 5" />
										<span class="order model">Model Name</span>
										<span class="order">catalog number: <span class="number">357</span></span>
										<span class="order"><span class="buy-text">Buy Now</span><span class="price"><span class="dollar">$</span>874<span class="sub-text">.99</span></span></span>
									</a>
							    </li>
							    <li>
									<a href="#" class="product" title="Product 6">
										<img src="css/images/product-6.jpg" alt="Product Image 6" />
										<span class="order model">Model Name</span>
										<span class="order">catalog number: <span class="number">1926</span></span>
										<span class="order"><span class="buy-text">Buy Now</span><span class="price"><span class="dollar">$</span>1199<span class="sub-text">.99</span></span></span>
									</a>	
							    </li>
							    <li>
									<a href="#" class="product" title="Product 7">
										<img src="css/images/product-7.jpg" alt="Product Image 7" />
										<span class="order model">Model Name</span>
										<span class="order">catalog number: <span class="number">1321</span></span>
										<span class="order"><span class="buy-text">Buy Now</span><span class="price"><span class="dollar">$</span>27<span class="sub-text">.99</span></span></span>
									</a>	
							    </li>
							    <li>
									<a href="#" class="product" title="Product 8">
										<img src="css/images/product-8.jpg" alt="Product Image 8" />
										<span class="order model">Model Name</span>
										<span class="order">catalog number: <span class="number">299</span></span>
										<span class="order"><span class="buy-text">Buy Now</span><span class="price"><span class="dollar">$</span>4<span class="sub-text">.99</span></span></span>
									</a>	
							    </li>
							</ul>
							<div class="cl">&nbsp;</div>
						</div>
						<!-- End Row -->
					</div>
					<!-- End Case -->
					<!-- Case -->
					<div class="case">
						
							
						</div>
						<!-- End Products Slider -->
					</div>
					<!-- End Case -->
				</div>
				<!-- End Content -->
			</div>
			<!-- End Shell -->
		</div>
		<!-- End Main -->
		<div id="footer-push" class="cl">&nbsp;</div>
	</div>
	<!-- End Wrapper -->
	<!-- Footer -->
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
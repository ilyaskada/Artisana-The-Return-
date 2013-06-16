<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
	String contextPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en-US" xmlns="http://www.w3.org/1999/xhtml" dir="ltr">
<head>
	<title>CSS Free Templates with jQuery Slider</title>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" href="css/smart_cart.css" type="text/css" media="all" />
	<link rel="shortcut icon" href="css/images/favicon.ico" />
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
	<!--[if IE 6]>
		<link rel="stylesheet" href="css/ie6.css" type="text/css" media="media" />
		<script src="js/png-fix.js" type="text/javascript" charset="utf-8"></script>
	<![endif]-->
	<script src="js/jquery-1.6.2.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/jquery.jcarousel.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/jquery-func.js" type="text/javascript" charset="utf-8"></script>	
	<script src="js/custom.js" type="text/javascript" charset="utf-8"></script>	
	<script src="js/jquery.smartCart-2.0.js" type="text/javascript" charset="utf-8"></script>	
	<script type="text/javascript">
	    $(document).ready(function(){
    	// Call Smart Cart    	
  		$('#SmartCart').smartCart({
          onAdd: function(pObj,quantity){ return cartAdd(pObj,quantity);}, 
          onAdded: function(pObj,quantity){  cartAdded(pObj,quantity);},
          onRemove: function(pObj){return cartRemove(pObj);}, 
          onRemoved: function(pObj){ cartRemoved(pObj);}, 
          onUpdate: function(pObj,quantity){ return cartUpdate(pObj,quantity); }, 
          onUpdated: function(pObj,quantity){ cartUpdated(pObj,quantity); },  //  
          onCheckout: function(Obj){ cartCheckout(Obj); }  //  
      });
      // On add
      function cartAdd(obj,qty){
         var msg = "Can i add the product "+obj.attr("pname")+ " of quantity "+qty+" to cart?"; 
         $("#cartMessage").html("<strong>onAdd</strong> event trigged");
         return confirm(msg);
      }
      // On added
      function cartAdded(obj,qty){
         var msg = "I'm added the product "+obj.attr("pname")+ " of quantity "+qty+" to cart."; 
         $("#cartMessage").html("<strong>onAdded</strong> event trigged <br />Message: "+msg);
      }
      // On Remove
      function cartRemove(obj){
         var msg = "Can i remove the product "+obj.attr("pname")+ " from cart?"; 
         $("#cartMessage").html("<strong>onRemove</strong> event trigged");
         return confirm(msg);
      }
      // On Removed
      function cartRemoved(obj){
         var msg = "I'm removed the product "+obj.attr("pname")+ " from cart."; 
         $("#cartMessage").html("<strong>onRemoved</strong> event trigged <br />Message: "+msg);
      }
      // On Update
      function cartUpdate(obj,qty){
         var msg = "Can i update the quantity of the product "+obj.attr("pname")+ " to "+qty+"?"; 
         $("#cartMessage").html("<strong>onUpdate</strong> event trigged");
         return confirm(msg);
      }
      // On Updated
      function cartUpdated(obj,qty){
         var msg = "I'm updated the quantity of the product "+obj.attr("pname")+ " to "+qty+"?"; 
         $("#cartMessage").html("<strong>onUpdated</strong> event trigged <br />Message: "+msg);
      }
      // On Checkout
      function cartCheckout(obj){
         var msg = "I'm listing the product id, quantity of the selected products<br /> ";                
         obj.children("option").each(function(n) {                     
            var pValue = $(this).attr("value");
            var valueArray = pValue.split('|');
            var prdId = valueArray[0];
            var pQty = valueArray[1];
            msg += "ProductId: "+prdId+" Quantity: "+pQty+"<br />";

        });

         $("#cartMessage").html("<strong>onCheckout</strong> event trigged <br />Message: "+msg);
      }                  
      
		});
	    </script>
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

					   

					    <li class="nobg"><a href="#" class="Panier" title="My Bag">Panier</a></li>
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
			<!-- Shell -->
			<div class="shell">
				<!-- Header -->
				<div id="header">
					<h1 id="logo"><a href="#" class="notext" title="Shopper Friend">Shopper Friend</a></h1>
					<div id="navigation">
						<ul>
						    <li><a href="home.html" class="active" title="For Boys"><span>Accueil</span></a></li>
		

				 

   <li><a href="Catalogue.jsp" title="For Girls"><span>Catalogue</span></a></li>
						    <li><a href="#" title="Common"><span>Présentation</span></a></li>
						</ul>
					</div>
					<div class="cl">&nbsp;</div>
				</div>
				<!-- End Header -->
				<!-- Slider -->
				
						   
					
				<!-- End Slider -->
				<!-- Content -->
<table align="center" border="0" cellpadding="0" cellspacing="0">
<tr><td>  
<form action="results.php" method="post">
<!-- Smart Cart HTML Starts -->
  <div id="cartMessage" style="padding:3px;width:692px;height:40px;border: 1px solid #CCC;color:#5A5655;font:12px Verdana,Arial,Helvetica,sans-serif;overflow:auto;">
  </div>
  <br />
  <div id="SmartCart" class="scMain">
    <input type="hidden" pimage="css/images/product-1.jpg" pprice="2299.99" pdesc="Thsg shsjs jsjshh sjshshs jshss jkssqsmpqs jnjqsqp qslqsqjsj kqsjqj qksqskqj qskqsjqj qksqsj." pcategory="hsqskj" pname="sskljlkjds" pid="100"/>
    <input type="hidden" pimage="css/images/product-10.jpg" pprice="2699.99" pdesc="ssskksksnshhhssssssssnsssssjjj." pcategory="losss" pname="sksksksjshshss" pid="101"/>
    <input type="hidden" pimage="css/images/product-11.jpg" pprice="550.00" pdesc="ssksjshshshsjhsjsjsjkmkfmfsdfsdfsdfsdfsdfsdfsfsdfssdfsdf." pcategory="fsfsdfs" pname="dqdqsdqsdqsdnklqdjhqdlkqhdqlksdqsdhlqsfdsfdsfsdfsdfsfsdfsdfsdfsdfjgjghjgh" pid="102"/>
    <input type="hidden" pimage="css/images/product-12.jpg" pprice="750.00" pdesc="dqffdqsfjlkjlkjdlkdjqsldjqsdlqskdjlkddqsdqsdokkkkkdqsdqsdm." pcategory="fsfsdfsdfsd" pname="qsdfsdfdsfsdqsdqd" pid="103"/>
    <input type="hidden" pimage="css/images/product-2.jpg" pprice="1600.00" pdesc="IMAC G5/1.8 256MB 160GB SD 20IN OS10.3" pcategory="dfsfsdfsd" pname="Apple iMac G5 Desktop" pid="104"/>
    <input type="hidden" pimage="css/images/product-3.jpg" pprice="1150.00" pdesc="" pcategory="fsdfsd" pname="fdsfsdfsdfsd" pid="105"/>
    <input type="hidden" pimage="css/images/product-4.jpg" pprice="148.85" pdesc="" pcategory="Accessories" pname="Headphone with mic" pid="106"/>                       
  </div>
<!-- Smart Cart HTML Ends -->
</form>
</td></tr>
</table>
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Se  Connecter</title>
  <link rel="stylesheet" href="css/style.css">
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body>
  <section class="container">
    <div class="login">
      <h1>Gérer Votre Boutique En Ligne</h1>
      <form name="actionForm" action="Login_Admin_Servlet" method ="GET">
        <p><input type="text" name="login" value="" placeholder="Adresse Email"></p>
        <p><input type="password" name="password" value="" placeholder="Mot de Passe"></p>
        <p class="remember_me">
          <label>
            <input type="checkbox" name="remember_me" id="remember_me">
            Se Souvenir de Moi
          </label>
        </p>
        <p class="submit"><input type="submit" name="commit" value="Se  Connecter"></p>
      </form>
    </div>

    <div class="login-help">
       <a href="index.html">Mot De passe Oublié?.</a>
    </div>
  </section>

  
</body>
</html>
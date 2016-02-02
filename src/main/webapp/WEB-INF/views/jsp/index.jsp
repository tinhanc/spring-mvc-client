<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>MEMOWallet</title>
<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />

</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">MEMOWallet</a>
		</div>
	</div>
</nav>

<div class="container centered">
    <div class="row">
        <div class="col-xs-12 col-md-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        Payment Details
                    </h3>
                    <div class="checkbox pull-right">
                        <label>
                            <input type="checkbox" />
                            Remember
                        </label>
                    </div>
                </div>
                <div class="panel-body">
                    <form role="form">
                    <div class="form-group">
                        <label for="cardNumber">
                            CARD NUMBER</label>
                        <div class="input-group">
                            <input type="text" class="form-control" id="cardNumber" maxlength="16" placeholder="Valid Card Number"
                                required autofocus />
                            <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                        </div>
                    </div>
                      <!-- Name -->
          <div class="control-group">
            <label class="control-label"  for="username">CARD HOLDER'S NAME</label>
            <div class="controls">
                 <input type="text" class="form-control" id="cardNumber" placeholder=""
                                required  />
            </div>
          </div>
                    <div class="row">
                        <div class="col-xs-7 col-md-7">
                            <div class="form-group">
                                <label for="expityMonth">
                                    EXPIRY DATE</label>
                                <div class="col-xs-6 col-lg-6 pl-ziro">
                                    <input type="text" class="form-control" id="expityMonth" placeholder="MM" required />
                                </div>
                                <div class="col-xs-6 col-lg-6 pl-ziro">
                                    <input type="text" class="form-control" id="expityYear" placeholder="YY" required /></div>
                            </div>
                        </div>
                        <div class="col-xs-5 col-md-5 pull-right">
                            <div class="form-group">
                                <label for="cvCode">
                                    CVV2 CODE</label>
                                <input type="password" class="form-control" id="cvCode" placeholder="CVV2" required />
                            </div>
                        </div>
                    </div>
                    </form>
                </div>
            </div>
            <ul class="nav nav-pills nav-stacked">
                <li class="active"><a href="#"><span class="badge pull-right"><span class="glyphicon glyphicon-usd"></span>4200</span> Invoice Total</a>
                </li>
            </ul>
            <br/>
            <a href="#" class="btn btn-success btn-lg btn-block" id="learn-more" role="button">Pay</a>
        </div>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://cdn.omise.co/omise.js"></script>
<script>
  Omise.setPublicKey("pkey_test_515sxqadnwjpwawmus6");

  $(document).ready(function(){
      $("#learn-more").click(function(){
        var card = {
          "name": $('#cardNumber').val(),
          "number": $('#cardNumber').val(),
          "expiration_month": $('#expityMonth').val(),
          "expiration_year": $('#expityYear').val(),
          "security_code": $('#cvCode').val()
        };


        Omise.createToken("card", card, function (statusCode, response) {
          if (statusCode == 200) {
           		 console.log(statusCode);
				 console.log(response);
          } else {
				 console.log(response);
				 console.log(statusCode);
          };
        });

      });
  });
</script>

</body>
</html>
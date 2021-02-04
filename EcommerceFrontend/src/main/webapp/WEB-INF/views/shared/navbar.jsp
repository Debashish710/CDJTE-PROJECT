
<nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Zap</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">

			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="${contextRoot}/home">Home</a></li>
				<li><a href="${contextRoot}/about">About</a></li>
				<li><a href="${contextRoot}/product">Product</a></li>
				<li><a href="${contextRoot}/services">services</a></li>
				<li><a href="${contextRoot}/contact">contact</a></li>
				<div class="dropdown">
					<button onclick="myFunction()" class="dropbtn">Category</button>
					<div id="myDropdown" class="dropdown-content">
						<a href="#">Product 1</a> 
						<a href="#">Product 2</a> 
						<a href="#">Product	3</a>
					</div>
				</div>
			</ul>
		</div>
	</div>
	<!-- /.container-fluid -->
</nav>

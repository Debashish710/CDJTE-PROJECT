	<!-- carousel starts here -->
	<div id="carousel-example-generic" class="carousel slide"
		data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#carousel-example-generic" data-slide-to="0"
				class="active"></li>
			<li data-target="#carousel-example-generic" data-slide-to="1"></li>
			<li data-target="#carousel-example-generic" data-slide-to="2"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<div class="banner" style="background-image: url(${img}/3.jpg);"></div>
				<div class="carousel-caption">
					<h2 class="animated bounceInRight" style="animation-delay: 1s">
						We Are <span>Creative</span>
					</h2>
					<h3 class="animated bounceInLeft" style="animation-delay: 2s">Tour
						Planner and Executor Agency</h3>
					<p class="animated bounceInRight" style="animation-delay: 3s">
						<a href="#">Contact us</a>
					</p>
				</div>
			</div>
			<div class="item">
				<div class="banner" style="background-image: url(${img}/4.jpg);"></div>
				<div class="carousel-caption">
					<h2 class="animated slideInDown" style="animation-delay: 1s">
						We Are <span>Swap</span>
					</h2>
					<h3 class="animated fadeInUp" style="animation-delay: 2s">Tour
						Planner and Executor Agency</h3>
					<p class="animated zoomIn" style="animation-delay: 3s">
						<a href="#">Contact us</a>
					</p>
				</div>
			</div>
			<div class="item">
				<div class="banner" style="background-image: url(${img}/2.jpg);"></div>
				<div class="carousel-caption">
					<h2 class="animated zoomIn" style="animation-delay: 1s">
						We Are <span>Reliable</span>
					</h2>
					<h3 class="animated fadeInLeft" style="animation-delay: 2s">Tour
						Planner and Executor Agency</h3>
					<p class="animated zoomIn" style="animation-delay: 3s">
						<a href="#">Contact us</a>
					</p>
				</div>
			</div>

		</div>
		<!-- Controls -->
		<a class="left carousel-control" href="#carousel-example-generic"
			role="button" data-slide="prev"> <span
			class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#carousel-example-generic"
			role="button" data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
	<!-- carousel end here -->


<script>
	/* When the user clicks on the button, 
	                                                                                                                                                                      toggle between hiding and showing the dropdown content */
	function myFunction() {
		document.getElementById("myDropdown").classList.toggle("show");
	}

	// Close the dropdown if the user clicks outside of it
	window.onclick = function(event) {
		if (!event.target.matches('.dropbtn')) {
			var dropdowns = document.getElementsByClassName("dropdown-content");
			var i;
			for (i = 0; i < dropdowns.length; i++) {
				var openDropdown = dropdowns[i];
				if (openDropdown.classList.contains('show')) {
					openDropdown.classList.remove('show');
				}
			}
		}
	}
</script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
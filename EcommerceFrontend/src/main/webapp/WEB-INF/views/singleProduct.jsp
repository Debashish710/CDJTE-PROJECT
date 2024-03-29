<div class="container">
	<div class="row">
		<div class="col-xs-12">
			<ol class="breadcrumb">

				<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
				<li class="breadcrumb-item"><a href="${contextRoot}/product">All
						Products</a>
				<li class="breadcrumb-item active">${product.name}</li>

			</ol>


		</div>

	</div>

	<div class="row">

		<!-- code for image -->

		<div class="col-xs-12 col-sm-4">
			<div class="thumbnail">
				<img src="${img}/${product.code}.jpg" class="img-fluid" />

			</div>

		</div>

		<div class="col-xs-12 col-sm-8">
			<h3>${product.name}</h3>
			<hr />

			<p>${product.description}</p>
			<hr />

			<h4>
				Price: <strong>&#8377; ${product.unitPrice}</strong>
			</h4>
			<hr />

			<c:choose>
			
				<c:when test="${product.quantity <1}">
					<h6>
						Quantity Available : <span style="color: red">Out Of Stock</span>
					</h6>
				</c:when>

				<c:otherwise>
					<h6>Quantity Available : ${product.quantity}</h6>
				</c:otherwise>
				
			</c:choose>


			<c:choose>

				<c:when test="${product.quantity <1}">
					<a href="javascript.void(0)" class="btn btn-success disabled"><strike>Add To Cart</strike></a>
				</c:when>

				<c:otherwise>
					<a href="${contextRoot}/cart/add/${product.id}/product"
						class="btn btn-success">Add To Cart</a>
				</c:otherwise>

			</c:choose>


			<a href="${contextRoot}/product" class="btn btn-primary">Back</a>
		</div>

	</div>

</div>
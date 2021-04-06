
	<div class="row">
		<div class="col-md-3">
			<h1>Tour and Tourism</h1>
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<div class="col-md-9">
			<div class="row">
				<div class="col-lg-12">

					<c:if test="${userClickProduct==true}">

						<script>
							window.categoryId = '';
						</script>

						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active"><a href="${contextRoot}/product">All Products</a>
						</ol>
					</c:if>


					<c:if test="${userClickCategoryProduct ==true}">

						<script>
							window.categoryId = '${category.id}';
						</script>


						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/product">Home</a></li>
							<li class="active">Category</li>
							<li class="active"><a href="#">${category.name}</a></li>
						</ol>
					</c:if>
			
				</div>			
				
			</div>

			
                <div class="row">
				<div class="col-xs-12">
					<table id="productListTables" class="table table-striped table-bordered">
						<thead>
							<tr>
                            <th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Quantity</th>
								<th></th>
							</tr>
						</thead>

						<tfoot>
							<tr>
							<th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Quantity</th>
                                <th></th>
							</tr>
						</tfoot>

					</table>

				</div>

			</div>



		</div>
	</div>



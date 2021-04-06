<div class="list-group" id="sidebar">
	<c:forEach items="${categories}" var="category">

		<a href="${contextRoot}/category/${category.id}/products" class="list-group-item">${category.name}</a>
		
		
		
	</c:forEach>
</div>
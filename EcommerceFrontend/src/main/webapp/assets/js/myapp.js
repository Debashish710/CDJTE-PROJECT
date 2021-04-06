$(function(){
	switch(menu)
{
    case "Home":
	    $('#home').addClass('active');
	    break;

    case "About us":
		$('#about').addClass('active');
		break;
		
	case "Contact us":
		$('#contact').addClass('active');
		break;
		
	case "Product":
		$('#product').addClass('active');
		break;
		
	case "Product management":
		$('#viewproduct').addClass('active');
		break;
		
	case "Login":
		$('#login').addClass('active');
		break;
		
	}
})




var $table =$('#productListTables');

if($table.length)
	{
	
	
	var jsonUrl='';
		
	if(window.categoryId=='')
		{
		jsonUrl=window.contextRoot+'/json/data/all/products';
		
		}
	else
		{
		jsonUrl=window.contextRoot+'/json/data/category/'+window.categoryId+'/products';
		}
	
	$table.DataTable({
		lengthMenu:[[2,5,10,-1],['2 records','5 records','10 records','All']],
		pageLength:5,
		ajax:{
			url:jsonUrl,
			dataSrc:''
		},
		columns:[
		{
		data:'code',
		mRender:function(data,type,row)
		{
			return '<img src="'+window.contextRoot+'/resources/img/'+data+'.jpg" class="dataTableImg"/>';
		}
		},	
	    {
		data:'name'	
		},
		{
		data:'brand'	
		},
		{
		data:'unitPrice',
			mRender:function(data,type,row)
			{
				return '&#8377;'+data
			}
		},
		{
			data:'quantity',
			mRender:function(data,type,row)
			{
				if(data<1)
				{
					return'<span style="color:red">Out Of Stock</span>';
				}
				return data;
			}
		},
		{
			data:'id',
			mRender:function(data,type,row)
			{
				var str ='';
				str +='<a class="btn btn-primary" href="'+window.contextRoot+'/show/'+data+'/products">View Product</a>&#160;';
				
				str +='<a class="btn btn-success" href="#">Add To Cart</a>';
				
				return str;
			}
		}]
	});
	
	
	}


//for alert functionality

var $alert=$('.alert');
if($alert.length)
	{
	setTimeout(function(){
		$alert.fadeOut('slow');
	}
	,4000
	)}
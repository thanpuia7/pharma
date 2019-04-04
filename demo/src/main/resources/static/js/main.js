/**
 * 
 */
$(document).ready(function(){
	
	/* Company */
	
	
	$('.table .eBtn').on('click',function(event){
		
		event.preventDefault();
		var href = $(this).attr('href');
		
		$.get(href,function(tempCompany,status){
			
			
			$('.myForm #id').val(tempCompany.id);
			$('.myForm #title').val(tempCompany.title);
			$('.myForm #email').val(tempCompany.email);
			$('.myForm #contact_person').val(tempCompany.contact_person);
			$('.myForm #phone').val(tempCompany.phone);
			$('.myForm #address').val(tempCompany.address);
			
		});
		
		
		$('.myForm #exampleModal').modal();
	});
	
	
	
	$('.table .dBtn').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		
		$('#myModal #delRef').attr('href',href);
		$('#myModal').modal();
	});
	
	
	/* Customer */
	
$('.table .ceBtn').on('click',function(event){
		
		event.preventDefault();
		var href = $(this).attr('href');
		
		$.get(href,function(tempCustomer,status){
			
			
			$('.myForm #id').val(tempCustomer.id);
			$('.myForm #title').val(tempCustomer.shop);
			$('.myForm #email').val(tempCustomer.email);
			$('.myForm #contact_person').val(tempCustomer.contact_person);
			$('.myForm #phone').val(tempCustomer.phone);
			$('.myForm #address').val(tempCustomer.address);
			
		});
		
		
		$('.myForm #exampleModal').modal();
	});
	
	
	
	$('.table .cdBtn').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		
		$('#myModal #delRef').attr('href',href);
		$('#myModal').modal();
	});
	
	
	
	
	
	
	
	/* medicine */
	
$('.table .meBtn').on('click',function(event){
		
		event.preventDefault();
		var href = $(this).attr('href');
		
		$.get(href,function(tempMedicine,status){
			
			
			$('.myForm #id').val(tempMedicine.id);
			$('.myForm #name').val(tempMedicine.name);
			$('.myForm #packing').val(tempMedicine.packing);
			$('.myForm #packagee').val(tempMedicine.packagee);
			$('.myForm #company').val(tempMedicine.company);
			$('.myForm #manufacturer').val(tempMedicine.manufacturer);
			$('.myForm #HSNCode').val(tempMedicine.HSNCode);
			$('.myForm #HSNValue').val(tempMedicine.HSNValue);
			
		});
		
		
		$('.myForm #exampleModal').modal();
	});
	
	
	
	$('.table .mdBtn').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		
		$('#myModal #delRef').attr('href',href);
		$('#myModal').modal();
	});
	
	
	

	
	
	});
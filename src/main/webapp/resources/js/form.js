$(function() {
	CKEDITOR.replace("content");	
	CKEDITOR.config.height = 300;
	
	$(".addImage").click(function() {
		layer.popup("popup_upload", 350, 350);	
	});
});
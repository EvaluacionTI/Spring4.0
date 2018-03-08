/**
 * 
 */

function esVersionSoportada(){
	var esVersion = true;
	
	/*if($.browser.msie){
		if($.browser.msie){
			if(Number($.browser.version)<9){
				esVersion = false;
			}
		}
	}*/
	 var isChrome = /Chrome/.test(navigator.userAgent) && /Google Inc/.test(navigator.vendor);

	    if (isChrome) {
	    	esVersion = true;
	    }else{
	    	esVersion = false;
	    }	
	
	
	
	return esVersion;
}
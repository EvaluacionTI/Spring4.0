/**
 * 
 */

function esRUC(){
	var vDato, vRpta;

	//alert("Ingreso a la funcion");
	vDato = document.getElementById("idNroRuc").value;

	//alert(vDato);
	if (isNaN(vDato)){
		alert("El RUC debe ser dígitos numéricos del 0 al 9");
	}
	
	if (vDato.length < 11 || vDato.length > 11){
		alert("La longitud del RUC es de 11 dígitos");
	}else{
		
	}
	
	
}

/*
 * El Dígito Verificador es: 
 *  Igual al resultado si éste está entre 1 y 9
 *  K si el resultado es 10 y
 *  0 si el resultado es 11.
 */
function modulo11(pValor){
	

    suma = 0;
    x = 6;
 
    for (i=0; i<valor.length-1;i++){
      if ( i == 4 ) x = 8;
      digito = valor.charAt(i) - '0';
      x--;
      if ( i==0 ) suma += (digito*x);
      else suma += (digito*x);
    }
    resto = suma % 11;
    resto = 11 - resto;
    
    if ( resto >= 10) resto = resto - 10;
    if ( resto == valor.charAt( valor.length-1 ) - '0' ){
      return true;
	
}

	function isRUC(valor){
		this.trim = function(cadena){
		  cadena2 = "";
		  len = cadena.length;
		  for ( var i=0; i <= len ; i++ ) if ( cadena.charAt(i) != " " ){cadena2+=cadena.charAt(i);	}
		  return cadena2;
		};
		this.esnumero = function(campo){ 
			return (!(isNaN( campo )));
		};
		
	  valor = this.trim(valor);
	  if ( this.esnumero( valor ) ) {
	    if ( valor.length == 8 ){
	      suma = 0;
	      for (i=0; i<valor.length-1;i++){
	        digito = valor.charAt(i) - '0';
	        if ( i==0 ) suma += (digito*2);
	        else suma += (digito*(valor.length-i));
	      }
	      resto = suma % 11;
	      if ( resto == 1) resto = 11;
	      if ( resto + ( valor.charAt( valor.length-1 ) - '0' ) == 11 ){
	        return true;
	      }
	    } else if ( valor.length == 11 ){
	      suma = 0;
	      x = 6;
	      for (i=0; i<valor.length-1;i++){
	        if ( i == 4 ) x = 8;
	        digito = valor.charAt(i) - '0';
	        x--;
	        if ( i==0 ) suma += (digito*x);
	        else suma += (digito*x);
	      }
	      resto = suma % 11;
	      resto = 11 - resto;
	      
	      if ( resto >= 10) resto = resto - 10;
	      if ( resto == valor.charAt( valor.length-1 ) - '0' ){
	        return true;
	      }      
	    }
	  }
	  return false;
	}

	function isTelefono(pValor) {
		var patron = /^[0-9]{6,12}$/;
		
		if(typeof(pValor!="undefined") && pValor !="" ){
			return false;
		}
		return true;
	}
}
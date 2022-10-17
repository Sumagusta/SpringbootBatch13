/**
 * 
 */

function validation(){
	username = document.getElementById("username");
	vUsername = document.getElementById("vUsername");
	
	if(username.value == ""){
		vUsername.style.display = "block"
	}else{
		vUsername.style.display = "none"		
	}
}
var validate = function(){
    
          var firstName = document.getElementById("firstname").value;
          var lastName = document.getElementById("lastname").value;
          var email = document.getElementById("email").value;
          var pass1 = document.getElementById("pass1").value;
          var pass2 = document.getElementById("pass2").value;
          var pass2 = document.getElementById("pass2").value;

         if( firstName == "")
         {
             document.getElementById("msgFirstname").innerHTML = "Please enter your name!";
             return false;
         }
           if( lastName == "" )
         {
            document.getElementById("msgLastname").innerHTML = "Please provide your lastname!";
            return false;
         }
         
         if( email == "")
         {
            document.getElementById("msgEmail").innerHTML = "Please provide your email!"; 
            return false;
         }
    
        if( pass1 == "")
         {
            document.getElementById("msgPassword").innerHTML = "Please provide a password!"; 
            return false;
         }
    
        if(pass1 != pass2){
            document.getElementById("msgRepeat").innerHTML = "The password doesn't match."; 
            return false;
        }
    
         return true ;
      }
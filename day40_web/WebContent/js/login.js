function sendDate(){
   var f = document.form;
   if(f.id.value ==""){
      window.alert("id를 다시 입력하시오");
      f.id.focus();
      return false;
   }
   
   if(f.id.value.length < 4 || f.id.value.length > 20){
      window.alert("ID는 4자 이상 20자 이하입니다.");
      f.id.select();
      return false;
   }
   
   if(f.pwd.value ==""){
      window.alert("pwd를 다시 입력하시오");
      f.pwd.focus();
      return false;
   }
   if(f.pwd.value.length < 4 || f.pwd.value.length > 20){
	      window.alert("password는 4자 이상 20자 이하입니다.");
	      f.pwd.select();
	      return false;
	   }
   f.submit();
}
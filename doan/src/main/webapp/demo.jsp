<html>
 <head>
  <script type="text/javascript">
 
   function changeFunc() {
    var selectBox = document.getElementById("selectBox");
    var selectedValue = selectBox.options[selectBox.selectedIndex].value;
    alert(selectedValue);
   }
 
  </script>
 </head>
 <body>
  
  <button type="submit" onclick="myFunction()" >try</button>
  <input type="text" id="i" >
  <input type="text" id="i">
  <input type="text" id="i">
  <input type="text" id="i">
  <script>
function myFunction() {
  var x = document.getElementById("i");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}
</script>
 </body>
</html>
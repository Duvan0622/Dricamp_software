// Call the dataTables jQuery plugin
$(document).ready(function() {

});

async function registrarUsuario(){
    let datos={};
    datos.nombre=document.getElementById("txtNombre").value;
    datos.apellido=document.getElementById("txtApellido").value;
    datos.email=document.getElementById("txtEmail").value;
    datos.contrasena=document.getElementById("txtPassword").value;

    let repetirPassword= document.getElementById("txtRepetirPassword").value;

    if(repetirPassword != datos.contrasena){
    alert("La contraseña es diferente")
    return;
    }

    //fetch solicitud a la url
  const request = await fetch('api/productos', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    //Convierte los objetos de js en json para que los reciba la clase
    body: JSON.stringify(datos)

  });



 }


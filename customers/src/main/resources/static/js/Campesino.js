// Call the dataTables jQuery plugin
$(document).ready(function() {

  cargarProductos();
  $('#usuarios').DataTable();
});

async function cargarProductos(){

  const request = await fetch('api/productos', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }

  });
const usuarios = await request.json();

let listadoHtml='';

    for(let usuario of usuarios){
    let botonEliminar= '<a href="#" onclick="eliminarProducto(' + usuario.id + ', \'' + usuario.nombre + '\')"  class="btn btn-primary btn-icon-split"><span class="text">Comprar</span></a>';



    let productoHtml='<tr><td>'+usuario.id+'</td><td>'+usuario.nombre+'</td><td>'+usuario.apellido+'</td><td>'+usuario.email+'</td><td>'+usuario.contrasena+'</td><td>'+usuario.direccion+'</td><td>'+usuario.rol+'</td><td>'+botonEliminar+'</td></tr>'

    listadoHtml = listadoHtml+productoHtml;
    }

    document.querySelector("#productos tbody").outerHTML= listadoHtml;

 }

async function eliminarProducto(id,nombre){

if(!confirm("¿Desea eliminar el usuario"+nombre+"?")){
        return;
}


    const request = await fetch('api/productos/'+id, {
        method: 'DELETE',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        }



      });
      location.reload()

}
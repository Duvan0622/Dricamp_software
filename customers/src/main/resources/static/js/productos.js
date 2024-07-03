// Call the dataTables jQuery plugin
$(document).ready(function() {

  cargarProductos();
  $('#productos').DataTable();
});

async function cargarProductos(){

  const request = await fetch('productosCampo', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }

  });
const productos = await request.json();

let listadoHtml='';

    for(let producto of productos){
  let productoHtml='<tr><td>'+producto.id+'</td><td>'+producto.nombre+'</td><td>'+producto.precio+'</td><td>'+producto.categoria+'</td><td>'+producto.estado+'</td><td>'+producto.fechaProduccion+'</td><td>'+producto.descripcion+'</td><td><a href="#" class="btn btn-primary btn-icon-split"><span class="text">Comprar</span></a></td></tr>'

    listadoHtml = listadoHtml+productoHtml;
    }

    document.querySelector("#productos tbody").outerHTML= listadoHtml;

 }

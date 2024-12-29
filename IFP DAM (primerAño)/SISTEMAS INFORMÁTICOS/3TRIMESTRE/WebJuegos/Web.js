window.onload =() => {
    fetch("https://app-ejemplo-9f169.web.app/juegos.json")
    .then((respuestaServidor) => {
        return respuestaServidor.json()
    })
    .then((respuestaJSON) => {
        const parrafo= document.querySelector("#juegos")
        let contenidoHTML= "";
        respuestaJSON.forEach((juego)=>{
            const titulo= juego.nombre;
            const texto= juego.descripcion;
            const imagen= juego.imagen;
            contenidoHTML +=`
            <div style="background-image:url(imagenes/${imagen})">
            <h2><img class="juego" src="imagenes/${imagen}"> ${titulo}</h2>
                <p>
                    ${texto}
                </p>
            </div>
            `;
            
            parrafo.innerHTML= contenidoHTML;
        })
    })
    
}
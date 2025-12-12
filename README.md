<h1 align="center"> One Alura - Challenge de Conversor De Monedas</h1>

<h2 align="center"> Descripcion de los SCRIPTS</h2>

<h3> Clase Principal </h3>
<img width="954" height="197" alt="screenshot" src="https://github.com/user-attachments/assets/50eb2351-c66a-4231-9b84-ce8caa797b31" />
En clase ejecutamos el programa.

<h3> Clase Moneda </h3>
<img width="798" height="230" alt="screenshot" src="https://github.com/user-attachments/assets/f76ce41f-aa38-434a-961f-9cbc28dad6ef" />
Creamos el record "Moneda", utilizando el codigo Map (Especificamente Map<String, Double>), porque es una forma eficiente de poder manejar 
una lista de valores que puede variar.

<h3> Clase ConsultarMoneda</h3>
<img width="1506" height="1088" alt="screenshot" src="https://github.com/user-attachments/assets/472b7599-12ea-43c3-9e23-e413256e8934" />
En esta clase, creamos la URI, creamos un nuevo cliente y le pasamos nuestra URI, le decimos en que formato lo queremos y despues 
lo transformamos con Gson... Tambien creamos nuestra propia excepcion.

<h3>Clase ConvertirMoneda</h3>
<img width="1542" height="2870" alt="image" src="https://github.com/user-attachments/assets/867dc0d5-ca00-4260-b999-2ae68144dcee" />
Creamos el scanner para que nos tome lo que escribimos por el teclado, hacemos nuestro menu de opciones con while, con la condicion
de que sale de el, si el numero es igual a 7, con un carte que dice "Finalizo el programa... Gracias". Hacemos uso del switch
con sus respectivos case y defaul, asociandolo con el menu de opciones...
Pedimos el valor que se quiere convertir, lo capturamos y realizamos la conversion de la moneda. 
Tenemos nuestra excepcion, por si se ingresa algo que no sea un numero, el programa respondera de la siguien manera 
"Ocurrio un error (Ingrese un numero)" y con el while, te mostrara y pedira que ingreses una opcion.

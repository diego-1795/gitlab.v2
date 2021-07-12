1. Se ha reestructurado todo el proyecto para convertirlo en un proyecto Spring     

2. Se ha separado el proyecto en dos modulos, infraestructura y negocio, en el primero encontramos el entorno gitlab con su docker-compose y en el segundo estaría la parte de la llamada a la api de gitlab.     
   
3. Se tuvo fallos al crear la imagen gitlab con el dominio, se tuvo que tocar varios parametros en el entorno de Windows para que funcionara. Seguramente en linux no daría tantos problemas.      

4. No se ha podido completar la creacion del swagger, en este caso al tenerlo todo por modulos se facilita la creacion de este. Paracido al proyecto 2 con la diferencia que con la api de Gitlab ya tienes todos los metodos.

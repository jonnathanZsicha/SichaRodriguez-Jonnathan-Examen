
Esta es la estructura general de todo el proyecto que hemos realizado

![](WebContent/readme/estructura.png)

Esta es la persistencia de jpa se ingresan las entidades a la base de datos

![](WebContent/readme/persistence.png)

La estructura de la base de datos queda de la siguiente manera :

![](WebContent/readme/basedatos.png)

La primera entidad a generar fue el pedido que queda de la siguiente manera ya que tiene muchas comidas y se debe pagar con una trajeta de credito

![](WebContent/readme/entidadpedido.png)

La segunda entidad a crear fue la de comidas ya que estas pueden estar muchas comidas en un pedido

![](WebContent/readme/entidadcomida.png)

Y por ultimo nos dirigimos a crear la ultima entidad que es la Tarjeta de Credito

![](WebContent/readme/entidadtarjeta.png)

En esta interfaz jsp podemos ingresar a la base de datos varios tipos de comida con su respectivo precio

![](WebContent/readme/comida.png)

En esta interfaz podemos realizar un pedido pero en este caso le hemos puesto solo una comida

![](WebContent/readme/registrarpedido.png)

En la base de datos podemos observar que se ha creado el pedido y se le asignado a cada comida un numero de pedido al igual que a la tarjeta de credito

![](WebContent/readme/pedido.png)

En el caso de las tarjetas de credito hemos realizado un controlador para que este no cree las tarjetas

![](WebContent/readme/controladortarjetas.png)


LO QUE FALTARIA SERIA LISTAR TODAS LAS COMIDAS QUE POSEE UN PEDIDO CON SU TARJETA DE CREDITO.

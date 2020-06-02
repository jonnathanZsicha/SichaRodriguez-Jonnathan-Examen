<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
        <html>

        <head>
            <title>listar pedido comidas tarjeta</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>
        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: black">
                    <div>
                       
                    </div>

                    <ul class="navbar-nav">
                        
                    </ul>
                </nav>
            </header>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">


                
                       
                         <form action="<%=request.getContextPath()%>/UsuarioControler" method="get">
                        <fieldset class="form-group">
     
                            <label>Cedula</label> <input type="text" " class="form-control" name="cedula" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Nombre</label> <input type="text"  class="form-control" name="nombre" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Apellido</label> <input type="text" class="form-control" name="apellido" required="required">
                        </fieldset>
                         <fieldset class="form-group">
                            <label>Correo</label> <input type="text" class="form-control" name="correo" required="required">
                        </fieldset>
                         <fieldset class="form-group">
                            <label>Password</label> <input type="password" class="form-control" name="password" required="required">
                        </fieldset>

                        <button type="submit" class="btn btn-success">Guardar</button>
                        </form>
                    </div>
                </div>
            </div>
        </body>

        </html>
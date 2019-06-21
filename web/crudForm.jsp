<%-- 
    Document   : FormObraDeArte
    Created on : 18/04/2019, 20:02:21
    Author     : Ti-RodrigoMendes.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html class="h-100">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="https://getbootstrap.com.br/favicon.ico">
        <title>Formulario | Obras de Arte</title>
        <!-- Principal CSS do Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <!-- Estilos customizados para esse template -->
        <link href="css/form-validation.css" rel="stylesheet">  
    </head>
    <body class="d-flex flex-column h-100">
        <div class="container">
            <div class="py-5 text-center">
                <!-- <img class="d-block mx-auto mb-4" src="../../assets/brand/bootstrap-solid.svg" alt="" width="72" height="72"> -->
                <h2>Cadastro De Imagens</h2>
                <p class="lead">Abaixo um formulário para cadastro de imagens.</p>
            </div>
            <div class="row">
                <div class="col-md-12 order-md-12">
                    <h4 class="mb-3">Cadastro e Fotos</h4>
                    <form action="crudImagen.jsp" method="post" class="needs-validation" >
                        <div class="mb-3">
                            <label for="titulo">Titulo</label>
                            <input type="text" class="form-control" placeholder="" name="txtTitulo" required>
                            <div class="invalid-feedback">
                                É obrigatório o preenchimento deste campo.
                            </div>
                        </div>
                        <div class="row">                       
                            <div class="col-md-6 mb-3">
                                <label for="dimensoes">Dimensões fisicas</label>
                                <input type="text" class="form-control" placeholder="" name="txtDimensao">
                                <div class="invalid-feedback">
                                    É obrigatório o preenchimento deste campo.
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="procedencia">Procedencia</label>
                                <input type="text" class="form-control" placeholder="" name="txtProcedencia">
                                <div class="invalid-feedback">
                                    É obrigatório o preenchimento deste campo.
                                </div>
                            </div>         
                        </div>
                        <div class="row">
                            <div class="col-md-6 mb-3">
                                <label for="data">Data</label>
                                <input type="date" class="form-control" placeholder="" name="txtDate" >
                                <div class="invalid-feedback">
                                    É obrigatório o preenchimento deste campo.
                                </div> 

                            </div>    
                            <div class="col-md-6 mb-3">
                                <label for="tipo">Instituição</label>
                                <div class="input-group mb-3">
                                    <select class="custom-select" name="txtTipo" id="inputGroupSelect01">
                                        <%
                                            out.println("<option value=''></option>");
                                            out.println("<option value='EAAMT'>EAAMT</option>");
                                            out.println("<option value='EIC'>EIC</option>");
                                            out.println("<option value='ETFMT'>ETFMT</option>");
                                            out.println("<option value='CEFETMT'>CEFETMT</option>");
                                            out.println("<option value='IFMT'>IFMT</option>");
                                        %>
                                    </select>
                                </div>
                                <div class="invalid-feedback">
                                    É obrigatório o preenchimento deste campo.
                                </div>
                            </div> 
                        </div>
                            <div class="mb-3">
                                <label for="autor">Autor</label>
                                <input type="text" class="form-control" placeholder="" name="txtAutor" >
                                <div class="invalid-feedback">
                                    É obrigatório o preenchimento deste campo.
                                </div>
                            </div>
                            <div class="mb-3">
                                <label for="imagen">Imagen</label>
                                <input type="text" class="form-control" placeholder="" name="txtImagen" >
                                <div class="invalid-feedback">
                                    É obrigatório o preenchimento deste campo.
                                </div>
                            </div>
                            <hr class="mb-4">
                            <button class="btn btn-primary btn-lg btn-block" type="submit"> Gravar Formulario</button>
                    </form>
                    <%
                        if (session.getAttribute("msg") != null) {

                            out.println("<div class='alert alert-primary' role = 'alert'>" + session.getAttribute("msg") + "</div >");
                            session.invalidate();

                        }
                    %>
                </div>
            </div>
            <footer class="my-5 pt-5 text-muted text-center text-small">
                <p class="mb-1">&copy;2019 - Todos os direito RMSistemas.</p>
                <ul class="list-inline">
                    <li class="list-inline-item"><a href="#">Privacidade</a></li>
                    <li class="list-inline-item"><a href="#">Termos</a></li>
                    <li class="list-inline-item"><a href="#">Suporte</a></li>
                </ul>
            </footer>
        </div>
        <!-- Principal JavaScript do Bootstrap
        ================================================== -->
        <!-- Foi colocado no final para a página carregar mais rápido -->
        <script src="js/jquery-3.3.1.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/jquery-3.3.1.min.js"><\/script>')</script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/holder.min.js"></script>
        <script>
            // Exemplo de JavaScript para desativar o envio do formulário, se tiver algum campo inválido.
            (function () {
                'use strict';

                window.addEventListener('load', function () {
                    // Selecione todos os campos que nós queremos aplicar estilos Bootstrap de validação customizados.
                    var forms = document.getElementsByClassName('needs-validation');

                    // Faz um loop neles e previne envio
                    var validation = Array.prototype.filter.call(forms, function (form) {
                        form.addEventListener('submit', function (event) {
                            if (form.checkValidity() === false) {
                                event.preventDefault();
                                event.stopPropagation();
                            }
                            form.classList.add('was-validated');
                        }, false);
                    });
                }, false);
            })();
        </script>
    </body>
</html>
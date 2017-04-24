<%@page import="objects.Entrada"%>
<%@page import="objects.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=utf-8" import="objects.BlogProject" errorPage=""%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Blog</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
        <link href='http://fonts.googleapis.com/css?family=Oregano' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <div class="header">
            <div class="wrap">
                <div class="logo"><h1><a href="index.jsp">Tecno Blog UMG</a></h1></div>
                <!--div class="nav">
                    <ul>
                        <li><a href="index.html">Home</a></li>
                        <li><a href="single.html">About</a></li>
                        <li><a href="single.html">Services</a></li>
                        <li><a href="single.html">News</a></li>
                        <li><a href="feedback.html">Contact</a></li>
                    </ul>
                </div-->
                <div class="clear"></div>
            </div>
        </div>
        <div class="wrap">

            <div>
                <%
                    BlogProject blog = new BlogProject();
                    ArrayList<Usuario> usuarios;
                    ArrayList<Entrada> entradas;
                     if (session.getAttribute("usuarios")==null){
                          session.setAttribute("usuarios", blog.getUsuarios());
                     }
                     if(request.getParameter("txtNombre")!= null){
                     Usuario postUs = new Usuario(8,request.getParameter("txtNombre"),request.getParameter("txtAlias"),request.getParameter("txtTelefono") );
                     usuarios = (ArrayList<Usuario>)session.getAttribute("usuarios");
                     usuarios.add(postUs);
                     session.setAttribute("usuarios",usuarios);
                     }
                    usuarios = (ArrayList<Usuario>)session.getAttribute("usuarios");
                    entradas = blog.getEntradas();


                %>


            </div>

            <div class="box">

                <img src="images/mac.png">
                <h2>¡Actualízate!</h2>
                <p>Te informamos sobre lo último en tecnología e informática.</p>
                <div class="clear"></div>
            </div>
            <div class="content">

                <!--Lista de entradas desde JAVA-->
                <%                            
                    for (int i = 0; i < entradas.size(); i++) {
                        Entrada entrada = entradas.get(i);
                        out.print("<div class='left-box'>");
                        out.print("<h2>" + entrada.getTitulo() + "</h2>");
                        out.print("<p class='para'>" + entrada.getFecha() + " por " + entrada.getAutor()+"</p>");
                        out.print("<div class='clear'></div>");
                        out.print("<p>"+entrada.getTexto()+"</p>");
                        out.print("</div>");
                        
                        
                    }
                %>

    
            </div>
            <div class="sidebar">
                <div class="right-box">
                    <!--Usuarios desde JAVA-->
                    <h2>Usuarios Registrados</h2>
                    <ul>
                        <%                            for (int i = 0; i < usuarios.size(); i++) {
                                Usuario usuario = usuarios.get(i);
                                out.print("<li><a href='#'>" + usuario.getAlias() + "</a></li>");
                            }
                        %>
                    </ul>
                    <h2>Registrarse</h2>
                    <div>
                        <form name="frmRegistro" action="index.jsp" method="get">
                        <table>
                            <tr>
                                <td><label>Nombre</label></td>
                                <td><input type="text" id="txtNombre" name="txtNombre"></td>
                            </tr>
                            <tr>
                                <td><label>Alias</label></td>
                                <td><input type="text" id="txtAlias" name="txtAlias"></td>
                            </tr>
                            <tr>
                                <td><label>Tel.</label></td>
                                <td><input type="text" id="txtTelefono" name="txtTelefono"></td>
                            </tr>
                            <tr>
                                <td><label>ID</label></td>
                                <td><input type="text" id="txtIdUsuario"></td>
                            </tr>
                            <tr><td colspan="2"><input type="submit" value="Grabar"></td></tr>
                        </table>
                        </form>
                    </div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    <div class="footer">
        <div class="wrap">
           
            <div class="clear"></div>
            <div class="copy">
                <p>&copy; 2017 rights Reseverd | Design by <a href="http://facebook.com">Danilo Luna</a></p>
            </div>
        </div>
    </div>
</body>
</html>

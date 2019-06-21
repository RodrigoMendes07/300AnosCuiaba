<%-- 
    Document   : crudImagen
    Created on : 19/06/2019, 20:25:19
    Author     : Ti - Mobile
--%>

<%@page import="br.com.projeto.dao.NewClass"%>
<%@page import="java.util.Calendar"%>
<%@page import="br.com.projeto.ImagenBean"%>
<%@page import="br.com.projeto.dao.ImagenDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <% 
            ImagenDao dao = new ImagenDao();
            ImagenBean bean = new ImagenBean();

            bean.setAutor(request.getParameter("txtAutor"));
            bean.setDimensao(request.getParameter("txtDimensao"));
            request.getParameter("txtDate");
            bean.setData(Calendar.getInstance());
            bean.setImagem(request.getParameter("txtImagen"));
            bean.setInstituicao(request.getParameter("txtTipo"));
            bean.setProcedimento(request.getParameter("txtProcedencia"));

           dao.salvar(bean);
           
        %>
        
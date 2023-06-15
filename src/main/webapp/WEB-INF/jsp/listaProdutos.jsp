<%-- 
    Document   : listaProdutos
    Created on : 14 de jun. de 2023, 23:14:09
    Author     : Lucas Flavio<lucasfgm at ifnmg.edu.br>
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Lista de Produtos Cadastrados</title>
    </head>
    <body>
        
        <h2>Lista de Produtos Cadastrados</h2>
        
        <c:if test="${not empty produtos}">
            <table>
            <tr>
                <td>Nome</td>
                <td>Preço</td>
                <td>Quantidade</td>
                <td>Categoria</td>
                <td>Sexo</td>
                <td>Tamanho</td>
            </tr>
            
            <c:forEach var="listValue" items="${produtos}">
                
                <tr>
                    <td>${listValue.nome}</td>
                    <td>${listValue.preco}</td>
                    <td>${listValue.quantidade}</td>
                    <td>${listValue.categoria}</td>
                    <td>${listValue.sexo}</td>
                    <td>${listValue.tamanho}</td>
                </tr>      
            </c:forEach>   
        
            </table>
            
        </c:if>
        
        <a href="/produto/produto">Cadastro</a>
        
    </body>
</html>

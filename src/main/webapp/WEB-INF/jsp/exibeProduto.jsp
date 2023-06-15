<%-- 
    Document   : exibeProduto
    Created on : 14 de jun. de 2023, 23:06:21
    Author     : Lucas Flavio<lucasfgm at ifnmg.edu.br>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Exibe detalhes do Produto</title>
    </head>
    <body>
        
        
        <h2>Detalhes do Produto Cadastrado</h2>
        <table>
            <tr>
                <td>Nome:</td>
                <td>${nome}</td>
            </tr>
            <tr>
                <td>Preço:</td>
                <td>${preco}</td>
            </tr>
            <tr>
                <td>Quantidade:</td>
                <td>${quantidade}</td>
            </tr>
            <tr>
                <td>Categoria:</td>
                <td>${categoria}</td>
            </tr>
            <tr>
                <td>Sexo:</td>
                <td>${sexo}</td>
            </tr>
            <tr>
                <td>Tamanho:</td>
                <td>${tamanho}</td>
            </tr>
        </table>
            
    
    <a href="/produto/produto">Cadastro</a>
    <a href="/produto/listaProdutos">Lista</a>
    </body>
</html>

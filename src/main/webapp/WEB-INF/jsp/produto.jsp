<%-- 
    Document   : produto
    Created on : 14 de jun. de 2023, 22:36:19
    Author     : Lucas Flavio<lucasfgm at ifnmg.edu.br>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>Cadastro de Produto</title>
    </head>
    
        
        
        <h2>Formulario de Cadastro de Produto</h2>
   <form:form method="POST" action="/produto/addProduto">
       <table>
           <tr>
               <td><form:label path ="nome">Nome>  
                   </form:label></td>
               <td><form:input path="nome" /></td>
           </tr>
           <tr>
               <td><form:label path ="preco">Preço>  
                   </form:label></td>
               <td><form:input path="preco" /></td>
           </tr>
           <tr>
               <td><form:label path ="quantidade">Quantidade>  
                   </form:label></td>
               <td><form:input path="quantidade" /></td>
           </tr>
           <tr>
               <td><form:label path ="categoria">Categoria>  
                   </form:label></td>
               <td><form:input path="categoria" /></td>
           </tr>
           <tr>
               <td><form:label path ="sexo">Sexo>  
                   </form:label></td>
               <td><form:input path="sexo" /></td>
           </tr>
           <tr>
               <td><form:label path ="tamanho">Tamanho>  
                   </form:label></td>
               <td><form:input path="tamanho" /></td>
               <tr>
              <td colspan="2">
               <input type="submit" value="Submit"/>
              </td>
           </tr>
       </table>  
   </form:form >
        
<a href="/produto/listaProdutos">Lista</a>

    
</html>

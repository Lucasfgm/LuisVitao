/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifnmg.edu.com.br.luisvitao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lucas Flavio<lucasfgm at ifnmg.edu.br>
 */

@Controller
public class ProdutoController {
 @RequestMapping(value = "/produto", method = RequestMethod.GET)
 public ModelAndView produto(){
     return new ModelAndView("produto", "command", new Produto());
 }   
 
 @RequestMapping(value = "/addProduto", method = RequestMethod.POST)
 public String adicionarProduto(
  @ModelAttribute("SpringWeb") Produto produto, ModelMap model,
  HttpServletRequest request) {

     
    model.addAttribute("nome", produto.getNome());
    model.addAttribute("preco", produto.getPreco());
    model.addAttribute("quantidade",produto.getQuantidade());
    model.addAttribute("categoria", produto.getCategoria());
    model.addAttribute("sexo", produto.getSexo());
    model.addAttribute("tamanho", produto.getTamanho());
    
    
    List<Produto> produtos = (List<Produto>)
    request.getSession().getAttribute("produtos");
    if(produtos == null){
        produtos = new ArrayList<Produto>();
    }
    
    produtos.add(produto);
    request.getSession().setAttribute("produtos", produtos);
    
    return "exibeProduto";
    
}
 
  @RequestMapping(value = "/listaProdutos", method = RequestMethod.GET)
  public String listarProdutos(
  @ModelAttribute("SpringWeb") ModelMap model, HttpServletRequest request) {
      
  List<Produto> produtos = (List<Produto>)
  request.getAttribute("produtos");
  
  model.addAttribute("produtos", produtos);
      
    return "listarProdutos";
  }
}
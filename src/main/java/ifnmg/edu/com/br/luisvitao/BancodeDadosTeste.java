/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifnmg.edu.com.br.luisvitao;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author Lucas Flavio<lucasfgm at ifnmg.edu.br>
 */

@Singleton
@Startup
public class BancodeDadosTeste implements BancodeDadosTesteLocal{
    
  @Inject
  private ProdutoServiceLocal produtoService;
  
  @PostConstruct  
  @Override
  public void popularBanco(){
      
      Produto p1 = new Produto();
      
       p1.setNome("Tênis Lona Marino Flat");
       p1.setPreco(50.00);
       p1.setQuantidade(3);
       p1.setCategoria(Categoria.CALÇADO);
       p1.setTamanho(Tamanho.BR40);
       p1.setSexo(Sexo.FEMENINO);
       
       p1.toString();
      
      produtoService.salvar(p1);
  }
            
}

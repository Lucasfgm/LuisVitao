/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifnmg.edu.com.br.luisvitao;

import javax.persistence.EntityManager;

/**
 *
 * @author Lucas Flavio<lucasfgm at ifnmg.edu.br>
 */
public class ProdutoDAOImpl implements ProdutoDAO {
    
    private EntityManager em;

     public ProdutoDAOImpl (EntityManager em) {
     this.em = em;
  }

    @Override
    public void salvar(Produto produto){
        em.persist(produto);
    }
     
     
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ifnmg.edu.com.br.luisvitao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lucas Flavio<lucasfgm at ifnmg.edu.br>
 */
@Stateless
public class ProdutoService implements ProdutoServiceLocal {

    @PersistenceContext(unitName = "LuisVitaoPU")
    private EntityManager entityManager;
    
    @Override
    public void salvar(Produto produto) {
        entityManager.persist(produto);

    }
}

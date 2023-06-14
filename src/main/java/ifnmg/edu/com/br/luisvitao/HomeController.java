/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifnmg.edu.com.br.luisvitao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* HomeController
*/
@RestController
@RequestMapping("/")
public class HomeController {
    public HomeController() {
    }

    @GetMapping
    public String getString() {
        return "Hello World";
    }
}

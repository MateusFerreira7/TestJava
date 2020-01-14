package com.algaworks.gestaofestas;

import com.algaworks.gestaofestas.Convidados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ConvidadosController {

  @Autowired
  private Convidados convidados;
  
    @GetMapping("/convidados")
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("ListaConvidados");
        mv.addObject(new Convidado());
        mv.addObject( "Convidados", convidados.findAll());
        return mv;
    }
    @PostMapping("/convidados")
    public String salvar(Convidado convidado) {

        this.convidados.save(convidado);
        return "redirect:/convidados";
        
    }
    @RequestMapping("/convidados/excluir/{id}")
    public String excluir(@PathVariable ("id") long id) {
           
         convidados.findById(id); 
         this.convidados.deleteById(id);
         return "redirect:/convidados";
    }
}
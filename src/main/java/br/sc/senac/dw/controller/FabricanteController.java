package br.sc.senac.dw.controller;

import br.sc.senac.dw.model.entidade.Fabricante;
import br.sc.senac.dw.service.FabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/fabricantes") // shorthand for @Controller and @ResponseBody rolled together
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:5501"}, maxAge = 3600)
public class FabricanteController {

    @Autowired
    private FabricanteService fabricanteService;

    @PostMapping(value = "/cadastrar")
    public Fabricante cadastrar(@RequestBody Fabricante novoFabricante) {
        return fabricanteService.inserir(novoFabricante);
    }

    @GetMapping(value = "/listar")
    public List<Fabricante> findAll(){
        return fabricanteService.findAll();
    }
}

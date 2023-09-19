package br.sc.senac.dw.service;

import br.sc.senac.dw.model.entidade.Fabricante;
import br.sc.senac.dw.model.repository.FabricanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FabricanteService {

    @Autowired
    private FabricanteRepository fabricanteRepository;

    public Fabricante inserir(Fabricante novoFabricante)  {
        return fabricanteRepository.save(novoFabricante);
    }
    public List<Fabricante> findAll(){
       List<Fabricante> buscarTodos = fabricanteRepository.findAll();
       return buscarTodos;
    }
}

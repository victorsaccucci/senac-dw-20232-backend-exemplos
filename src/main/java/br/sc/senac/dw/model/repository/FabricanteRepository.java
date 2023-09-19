package br.sc.senac.dw.model.repository;

import br.sc.senac.dw.model.entidade.Fabricante;
import br.sc.senac.dw.model.entidade.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FabricanteRepository extends JpaRepository<Fabricante, Integer> {

}

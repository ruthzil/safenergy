package br.com.ruthzil.safeenergy.dominio.pessoa.repository;

import br.com.ruthzil.safeenergy.dominio.pessoa.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPessoaRepository extends JpaRepository<Pessoa, Long> {

}

package br.com.ruthzil.safeenergy.dominio.endereco.repository;

import br.com.ruthzil.safeenergy.dominio.endereco.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnderecoRepository extends JpaRepository<Endereco, Long> {


}

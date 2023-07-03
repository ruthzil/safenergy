package br.com.ruthzil.safeenergy.dominio.endereco.repository;


import br.com.ruthzil.safeenergy.dominio.endereco.entity.Endereco;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Set;

@Repository
public class EnderecoRepository {


    static private Set<Endereco> endereco;

    public Collection<Endereco> findAll() {
        return endereco;
    }

    public static Endereco save(Endereco e) {
        e.setId(endereco.size() + 1L);
        endereco.add(e);
        return e;
    }



}

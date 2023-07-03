package br.com.ruthzil.safeenergy.dominio.pessoa.repository;

import br.com.ruthzil.safeenergy.dominio.pessoa.entity.Pessoa;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashSet;
import java.util.Set;

@Repository
public class PessoaCollectionRepository {

    static private Set<Pessoa> pessoa;

    public static Pessoa save(Pessoa p) {
        p.setId(pessoa.size() + 1L);
        pessoa.add(p);
        return p;

    }
}

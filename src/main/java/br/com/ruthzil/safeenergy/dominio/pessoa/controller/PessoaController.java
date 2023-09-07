package br.com.ruthzil.safeenergy.dominio.pessoa.controller;

import br.com.ruthzil.safeenergy.dominio.pessoa.entity.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaCollectionRepository repo;

    @PostMapping
    public ResponseEntity save(@RequestBody Pessoa pessoa) {
        repo.save(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }




}

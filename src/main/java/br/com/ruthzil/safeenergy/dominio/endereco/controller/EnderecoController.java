package br.com.ruthzil.safeenergy.dominio.endereco.controller;

import br.com.ruthzil.safeenergy.dominio.endereco.entity.Endereco;
import br.com.ruthzil.safeenergy.dominio.endereco.repository.IEnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private IEnderecoRepository repo;

    @PostMapping
    public ResponseEntity save(@RequestBody Endereco endereco) {

        repo.save(endereco);
        return ResponseEntity.status(HttpStatus.CREATED).build();



    }

}

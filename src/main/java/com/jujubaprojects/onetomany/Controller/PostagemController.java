package com.jujubaprojects.onetomany.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jujubaprojects.onetomany.Model.Postagem;
import com.jujubaprojects.onetomany.Repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
public class PostagemController {
    
    @Autowired
    private PostagemRepository postagemRepository;

    @GetMapping("/listar")
    public Iterable<Postagem> listar(){
        return postagemRepository.findAll();
    }
    
    @PostMapping("/cadastrar")
    public Postagem cadastrar(@RequestBody Postagem postagem){
        return postagemRepository.save(postagem);
    }
    
}

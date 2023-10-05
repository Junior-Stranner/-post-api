package com.jujubaprojects.onetomany.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jujubaprojects.onetomany.Model.Comentario;
import com.jujubaprojects.onetomany.Repository.ComentarioRepository;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    
    @Autowired
    private ComentarioRepository comentarioRepository;

    @GetMapping("/listar")
    public Iterable<Comentario> listar(){
        return comentarioRepository.findAll();
    }
    
    @PostMapping("/cadastrar")
    public Comentario cadastrar(@RequestBody Comentario comentario){
        return comentarioRepository.save(comentario);
    }
}

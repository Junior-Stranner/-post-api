package com.jujubaprojects.onetomany.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jujubaprojects.onetomany.Model.Comentario;

@Repository
public interface ComentarioRepository extends CrudRepository <Comentario , Long>{
    
}

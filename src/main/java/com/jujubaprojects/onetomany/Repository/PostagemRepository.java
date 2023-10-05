package com.jujubaprojects.onetomany.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jujubaprojects.onetomany.Model.Postagem;

@Repository
public interface PostagemRepository extends  CrudRepository <Postagem , Long >{
    
}

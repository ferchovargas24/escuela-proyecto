package org.unitec.proyectoescuela;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioProfesor extends MongoRepository<Profesor,String>{
    
}

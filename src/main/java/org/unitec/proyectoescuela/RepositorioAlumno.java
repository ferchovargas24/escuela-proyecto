package org.unitec.proyectoescuela;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioAlumno extends MongoRepository<Alumno,String>{
    
}

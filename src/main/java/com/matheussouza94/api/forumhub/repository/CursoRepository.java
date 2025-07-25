package com.matheussouza94.api.forumhub.repository;

import com.matheussouza94.api.forumhub.domain.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}

package com.matheussouza94.api.forumhub.repository;

import com.matheussouza94.api.forumhub.domain.autor.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}

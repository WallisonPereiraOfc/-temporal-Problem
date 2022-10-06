package com.dev.backend.respository;

import com.dev.backend.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade,Long> {
}

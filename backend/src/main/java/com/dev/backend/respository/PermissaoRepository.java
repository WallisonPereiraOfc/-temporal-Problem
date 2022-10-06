package com.dev.backend.respository;

import com.dev.backend.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissaoRepository  extends JpaRepository<Permissao,Long> {
}

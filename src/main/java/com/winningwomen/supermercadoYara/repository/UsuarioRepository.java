package com.winningwomen.supermercadoYara.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winningwomen.supermercadoYara.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByUserName(String user_name);
	List<Usuario> findAllByOrderByNomeAsc();
    Usuario findByEmailEqualsAndSenhaEquals(String email, String senha);
    Usuario findByUserName(String userName);
    boolean existsByEmail(String email);
    Usuario findByEmailEquals(String email);
}

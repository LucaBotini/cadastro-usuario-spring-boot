package com.lucabotini.cadastrousuario.infrastructure.repository;

import com.lucabotini.cadastrousuario.infrastructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

// Repositório utilizado para gerenciar a entidade Usuario.
// Extende JpaRepository, fornecendo métodos prontos para operações CRUD,
// paginação e ordenação no banco de dados sem precisar escrever implementações manuais.
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    Optional<Usuario> findByEmail(String email);

    @Transactional //utilizamos essa anotação para que se houver (qualquer) erro, não concluir o delete.
    void deleteByEmail(String email);
}

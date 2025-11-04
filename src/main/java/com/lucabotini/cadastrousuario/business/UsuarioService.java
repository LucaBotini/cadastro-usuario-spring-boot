package com.lucabotini.cadastrousuario.business;

import com.lucabotini.cadastrousuario.infrastructure.entitys.Usuario;
import com.lucabotini.cadastrousuario.infrastructure.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@Service //indica ao Spring que essa é uma classe de serviços.
public class UsuarioService {

    @Autowired //
    private UsuarioRepository repository;

    public void salvarUsuario(Usuario usuario){
        repository.saveAndFlush(usuario); //saveAndFlush faz o save dos dados e fecha a conexão com o banco de dados.
    }

    public Usuario buscarUsuarioPorEmail(String email){
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado.")
        );
    }

    public void deletarUsuarioPorEmail(String email){
        repository.deleteByEmail(email);
    }

    public void atualizarUsuarioPorId(Integer id, Usuario usuario){
        Usuario usuarioEntity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID de Usuário não localizado."));
        if (usuario.getEmail() != null) usuarioEntity.setEmail(usuario.getEmail());
        if (usuario.getNome() != null) usuarioEntity.setNome(usuario.getNome());

        repository.saveAndFlush(usuarioEntity);
    }
}

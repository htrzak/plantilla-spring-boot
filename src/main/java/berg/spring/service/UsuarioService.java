package berg.spring.service;

import java.util.List;

import berg.spring.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {

    List<Usuario> Listar();
    Usuario listarPorId(Long id);
    // Optional<Usuario> listarPorId()Long id;
    Usuario crear(Usuario usuario);
    Usuario editar(Usuario usuario);
    Usuario borrar(Long id);
}


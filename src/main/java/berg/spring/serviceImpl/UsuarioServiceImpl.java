package berg.spring.serviceImpl;

import java.util.List;

import berg.spring.model.Usuario;
import berg.spring.repository.UsuarioRepositorio;
import berg.spring.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepositorio usuarioRepo;

    @Override
    public List<Usuario> Listar() {
        return usuarioRepo.findAll();
    }

    @Override
    public Usuario listarPorId(Long id) {
        return usuarioRepo.findById(id).get();
    }

    @Override
    public Usuario crear(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    @Override
    public Usuario editar(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    @Override
    public Usuario borrar(Long id) {
        Usuario usu = usuarioRepo.findById(id).get();
        if(usu != null) {
            usuarioRepo.delete(usu);
        }
        return usu;
    }
}


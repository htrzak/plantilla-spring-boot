package berg.spring.controller;

import java.util.List;

import berg.spring.model.Usuario;
import berg.spring.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api")
public class UsuarioControlador {

    @Autowired
    UsuarioService usuarioServi;

    @GetMapping("/listar")
    public List<Usuario> listar(){
        return usuarioServi.Listar();
    }

    @GetMapping("/listarID/{id}")
    public Usuario listarPorId(@PathVariable("id") Long id) {
        return usuarioServi.listarPorId(id);
    }

    @PostMapping("/crear")
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioServi.crear(usuario);
    }

    @PutMapping("/editar/{id}")
    public Usuario editar(@RequestBody Usuario usuario, @PathVariable("id") Long id) {
        usuario.setId(id);
        return usuarioServi.editar(usuario);
    }

    @DeleteMapping("borrar/{id}")
    public Usuario borrar(@PathVariable("id") Long id) {
        return usuarioServi.borrar(id);
    }

}


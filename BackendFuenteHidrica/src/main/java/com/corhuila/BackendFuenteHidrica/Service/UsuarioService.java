package com.corhuila.BackendFuenteHidrica.Service;

import com.corhuila.BackendFuenteHidrica.Entity.Usuario;
import com.corhuila.BackendFuenteHidrica.IRepository.IUsuarioRepository;
import com.corhuila.BackendFuenteHidrica.IService.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioRepository repository;

    @Override
    public List<Usuario> All() {
        return repository.findAll();
    }

    @Override
    public Optional<Usuario> FindById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void Update(Usuario usuario, Long id) {
        //Verificar si existe el dato.

        // Reemplazar el dato que guardado por el nuevo

    }

    @Override
    public void Delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Usuario Save(Usuario usuario) {
        return repository.save(usuario);
    }
}

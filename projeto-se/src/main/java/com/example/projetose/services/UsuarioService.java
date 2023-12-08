package com.example.projetose.services;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.projetose.entities.Usuario;
import com.example.projetose.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    private static final String PASSWORD_REGEX = "^(?=.*[a-zA-Z]).{6,}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_REGEX);
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Usuario getUsuario(Integer idUsuario) {
        Optional<Usuario> usuario = usuarioRepository.findById(idUsuario);
        return usuario.get();
    }

    public Usuario salvar(Usuario usuario) throws RuntimeException{
        String senhaNormal = usuario.getSenha();
        String senhaCriptografada = bCryptPasswordEncoder.encode(senhaNormal);
        usuario.setSenha(senhaCriptografada);

        Usuario usr = usuarioRepository.findByLogin(usuario.getLogin());
        if(usr != null) {
            throw new RuntimeException("Esse login já existe");
        }

        Matcher matcher = pattern.matcher(senhaNormal);
        if (!matcher.matches()){
            throw new RuntimeException("Senha não atende aos requisitos minimos");
        }

        return usuarioRepository.save(usuario);
    }

    public Usuario atualizar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void remover(Integer idUsuario) {
        usuarioRepository.deleteById(idUsuario);
    }

    public Usuario getUsuarioPorLogin(String login) {
      return usuarioRepository.findByLogin(login);
    }

}

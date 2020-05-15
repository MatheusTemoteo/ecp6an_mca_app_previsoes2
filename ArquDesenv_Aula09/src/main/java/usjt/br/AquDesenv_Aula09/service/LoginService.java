package usjt.br.AquDesenv_Aula09.service;

import org.springframework.beans.factory.annotation.Autowired;

import usjt.br.ArquDesenv_Aula09.model.Usuario;
import usjt.br.ArquDesenv_Aula09.repository.UsuarioRepository;

public class LoginService {
	@Autowired
	UsuarioRepository usuarioRepo;
	public boolean logar (Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),

				usuario.getSenha()) != null;
	}
}

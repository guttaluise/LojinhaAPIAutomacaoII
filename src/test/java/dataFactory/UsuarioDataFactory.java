package dataFactory;

import pojo.UsuarioPojo;

public class UsuarioDataFactory {
    public static UsuarioPojo criarUsuarioAdmin(){
        UsuarioPojo usuario = new UsuarioPojo();
        usuario.setUsuarioLogin("gutta");
        usuario.setUsuarioSenha("123456");

        return usuario;
    }


}

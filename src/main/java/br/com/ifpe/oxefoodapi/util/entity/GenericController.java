package br.com.ifpe.oxefoodapi.util.entity;

import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.ifpe.oxefoodapi.util.exception.PreenchimentoException;

@CrossOrigin
public abstract class GenericController {
 
    protected void validarPreenchimentoChave(String chave) {

        if (chave == null || chave.equals("")) {
            throw new PreenchimentoException(PreenchimentoException.MSG_CHAVE_NAO_INFORMADA);
        }
    }
}

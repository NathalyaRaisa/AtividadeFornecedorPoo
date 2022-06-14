package aula.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException;


@SuppressWarnings("unused")
public class TesteProduto {
    @aula.code.Test
    public void  devRegistroProduto() {
        Produto produto2 = new Produto();

        String nome = "Computador";


        Assertions.assertEquals("notebook", produto2.nome);



            Produto produto3 = new Produto();

            String nome3 = "impressora";

            Assertions.assertEquals("impressora", produto3.nome);


    }




}


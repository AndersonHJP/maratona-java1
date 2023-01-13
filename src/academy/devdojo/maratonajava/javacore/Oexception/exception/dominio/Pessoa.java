package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}

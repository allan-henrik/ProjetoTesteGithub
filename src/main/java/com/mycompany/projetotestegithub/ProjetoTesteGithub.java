package com.mycompany.projetotestegithub;
import com.mycompany.usuarios.Alunos;

public class ProjetoTesteGithub {
    public static void main(String[] args) {
        Alunos Allan = new Alunos("Allan", 17);
        System.out.printf("%s", Allan.apresentar());
    }
}

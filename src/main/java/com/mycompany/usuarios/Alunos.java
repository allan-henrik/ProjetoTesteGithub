package com.mycompany.usuarios;

public class Alunos {
    public String nome;
    public Integer idade;
    
    public Alunos(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String apresentar(){
        return "\nNome: " + this.nome + "\nIdade: " + this.idade;
    }
}

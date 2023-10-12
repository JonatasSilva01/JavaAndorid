package com.example.navegacaoactivity;

import java.io.Serializable;


/*
*   Sem o Serializable não consigo fazer o trasporte dos meus Objetos(dados)
*   De uma tela para outra então preciso colocar ele ou o Parcelable[]
* */
public class Usuario implements Serializable {
    private String Nome;
    private String Sobrenome;
    private Integer Idade;
    private Float Altura;

    public Usuario() {

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
    }

    public Float getAltura() {
        return Altura;
    }

    public void setAltura(Float altura) {
        Altura = altura;
    }
}

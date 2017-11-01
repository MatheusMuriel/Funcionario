package br.edu.unifil.lp1.abstrato.modelo;

public abstract class Pessoa
{
    protected String nome;
    
    public Pessoa(String n){
        nome = n;
    }
    
    public String getNome(){
        return nome;
    }
    
    public abstract String getDescricao();
}

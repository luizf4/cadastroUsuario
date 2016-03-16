/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luiz
 */
public class Endereco {

    private String endereco;
    private String numero;
    private String cep;
    private String bairro;
    private String cidade;

    public Endereco(String endereco, String numero, String cep, String bairro, String cidade) {
        this.endereco = endereco;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "\n***ENDEREÇO***"
                + "\nRua: " + this.endereco.toUpperCase() + ", N.º: " + this.numero + "\n"
                + "Bairro: " + this.bairro.toUpperCase() + ", CEP: " + this.cep + "\n"
                + "Cidade: " + this.cidade.toUpperCase() + "\n";
    }

    
}

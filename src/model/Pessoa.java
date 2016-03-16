package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Luiz Fernando de Souza Matricula: 225272 ADS - EAD SOROCABA
 */
public class Pessoa extends Endereco {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String estadoCivil;
    private String sexo;
    private String interesses;

    SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");

    public Pessoa() {

        this("", "", null, "", "", "", "", "", "", "", "");

    }

    public Pessoa(String nome, String cpf, Date dataNascimento,
            String estadoCivil, String sexo, String interesses,
            String endereco, String numero, String cep, String bairro,
            String cidade) {
        super(endereco, numero, cep, bairro, cidade);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.interesses = interesses;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getInteresses() {
        return interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }

    /*@Override
    public String toString() {

        return "\n****DADOS PESSOAIS***\n"
                + "Nome: " + this.nome + "\n"
                + "CPF: " + this.cpf + "\n"
                + "Data Nasc.: " + this.dataNascimento + "\n";
    }*/
    @Override
    public String toString() {

        return "\n***DADOS PESSOAIS***"
                + "\nNome: " + nome.toUpperCase() + "\n"
                + "CPF: " + cpf + "\n"
                + "Data Nasc.: " + spf.format(dataNascimento) + "\n"
                + "Estado Civil: " + estadoCivil + "\n"
                + "Sexo: " + sexo + "\n"
                + super.toString() 
                + "\n***INTERESSES***\n" + interesses + "\n";
    }

}

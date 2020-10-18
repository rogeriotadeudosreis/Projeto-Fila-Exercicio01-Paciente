/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.model;

/**
 *
 * @author roger
 */
public class Paciente {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public Paciente() {
    }

    public Paciente(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome do paciente = " + nome.toUpperCase() + "\n"
                + "Cpf = " + cpf + "\n"
                + "Telefone = " + telefone + "\n"
                + "Email = " + email + "\n";
    }

}

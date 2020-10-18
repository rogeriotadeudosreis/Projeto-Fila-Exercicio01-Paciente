/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.model;

import java.util.List;

/**
 *
 * @author roger
 */
public class FilaPaciente {

    private int tamanho;
    private int inicio;
    private int fim;
    private Paciente[] paciente;
    private int quantPacientes;

    public FilaPaciente() {
        this(5);
    }

    public FilaPaciente(int tamanho) {
        if (tamanho <= 0) {
            throw new RuntimeException("Tamanho deve ser maior que zero!\n");
        }
        this.tamanho = tamanho;
        this.paciente = new Paciente[tamanho];
        inicio = 0;
        fim = 0;
        quantPacientes = 0;
    }

    public boolean isEmpty() {
        return quantPacientes == 0;
    }

    public boolean isFull() {
        return quantPacientes == paciente.length;
    }

    public int size() {
        return quantPacientes;
    }

    public void enqueue(Paciente elemento) {
        if (isFull()) {
            throw new RuntimeException("A fila excedeu o número maximo de atendimentos!\n"
                    + "Número máximo = " + tamanho);
        }
        paciente[fim] = elemento;
        fim = (fim + 1) % paciente.length;
        quantPacientes++;
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Não há nenhum paciente para chamar!\n");
        }
        inicio = (inicio + 1) % paciente.length;
        quantPacientes--;
    }

    public Paciente peek() {
        if (isEmpty()) {
            throw new RuntimeException("Não há nenhum paciente na fila aguardando!\n");
        }
        return paciente[inicio];
    }

    public void destroy() {
        inicio = 0;
        fim = 0;
        quantPacientes = 0;
    }
}

/*
 1. Desenvolva um programa que represente um fila de espera de um
consultório médico. Considere que os pacientes são registrados na fila assim
que chegam à sala de espera e ficam aguardando o chamado do médico,
que obedece a ordem de chegada. O programa deve permitir:
a) Inserir um paciente na fila de espera;
b) Chamar o paciente para ser atendido;
c) Verificar se a fila está cheia ou vazia;
d) Verificar o próximo paciente a ser atendido;
e) Informar quantos pacientes existem na fila de espera.
Considere que os pacientes possuem: CPF, Nome, fone e e-mail.
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

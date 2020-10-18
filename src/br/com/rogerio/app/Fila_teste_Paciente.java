/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.app;

import br.com.rogerio.model.FilaPaciente;
import br.com.rogerio.model.Paciente;

/**
 *
 * @author roger
 */
public class Fila_teste_Paciente {

    public static void main(String[] args) {
        FilaPaciente fila = new FilaPaciente(5);
        Paciente paciente1 = new Paciente("rogerio", "123"," 123", "gmail");
        fila.enqueue(paciente1);
        Paciente paciente2 = new Paciente("ivone", "123"," 123", "gmail");
        fila.enqueue(paciente2);
        Paciente paciente3 = new Paciente("blenda", "123"," 123", "gmail");
        fila.enqueue(paciente3);
        Paciente paciente4 = new Paciente("samuel", "123"," 123", "gmail");
        fila.enqueue(paciente4);
        Paciente paciente5 = new Paciente("ricardo", "123"," 123", "gmail");
        fila.enqueue(paciente5);
        
        System.out.println("Próximo da fila: " + fila.peek());
        fila.dequeue();// retirando rogerio da fila 
        System.out.println("Próximo da fila: " + fila.peek());
        fila.dequeue();// retirando ivone da fila 
        System.out.println("Próximo da fila: " + fila.peek());
        fila.dequeue();// retirando blenda da fila 
        System.out.println("Próximo da fila:" + fila.peek());
        fila.dequeue();// retirando samuel da fila 
        System.out.println("Próximo da fila: " + fila.peek());
       // fila.dequeue();// retirando ricardo da fila 
        
        System.out.println("Pacientes na fila: " + fila.size());
    }
}

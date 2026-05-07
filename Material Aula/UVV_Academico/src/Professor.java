/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab10
 */
public abstract class Professor {
    String nome;
    int matricula, cargaHoraria;
    double beneficio, salario;

    public Professor(String nome, int matricula, int cargaHoraria, double beneficio) {
        this.nome = nome;
        this.matricula = matricula;
        this.cargaHoraria = cargaHoraria;
        this.beneficio = beneficio;
    }
    
    
    
    double getBeneficio(){
        return salario;
    }
    
    abstract void calcularBeneficio();
}

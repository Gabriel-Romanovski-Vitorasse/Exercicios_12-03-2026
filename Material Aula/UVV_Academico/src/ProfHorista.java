/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab10
 */
public class ProfHorista extends Professor{
    double valorHora = 50;

    public ProfHorista(String nome, int matricula, int cargaHoraria, double beneficio) {
        super(nome, matricula, cargaHoraria, beneficio);
    }
    
    void calcularBeneficio(){
        salario = valorHora * cargaHoraria;
    }
}

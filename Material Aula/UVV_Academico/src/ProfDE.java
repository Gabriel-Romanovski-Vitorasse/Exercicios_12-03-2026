/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab10
 */
public class ProfDE extends Professor{

    public ProfDE(String nome, int matricula, int cargaHoraria, double beneficio) {
        super(nome, matricula, cargaHoraria, beneficio);
    }

    void calcularBeneficio(){
        salario = 2000 + (50 * cargaHoraria);
    }
}

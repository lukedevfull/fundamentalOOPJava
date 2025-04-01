package edu.luke.interfaceExercicies.equipamentos.impressoras;

public class DeskJet implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo com DeskJet");
    }
}

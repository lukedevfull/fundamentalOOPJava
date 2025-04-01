package edu.luke.interfaceExercicies.equipamentos.multifuncional;

import edu.luke.interfaceExercicies.equipamentos.copiadora.Copiadora;
import edu.luke.interfaceExercicies.equipamentos.digitalizadora.Digitalizadora;
import edu.luke.interfaceExercicies.equipamentos.impressoras.Impressora;

public class EquipamentoDeMultiplaInterface implements Impressora, Copiadora, Digitalizadora {
    
    @Override
    public void imprimir() {
        System.out.println("Imprimindo via Equipamento de Multipla Interface");
    }

    @Override
    public void copiar() {
        System.out.println("Copiando via Equipamento de Multipla Interface");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via Equipamento de Multipla Interface");
    }
}


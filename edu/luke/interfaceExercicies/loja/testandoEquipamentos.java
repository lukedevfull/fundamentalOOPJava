package edu.luke.interfaceExercicies.loja;

import edu.luke.interfaceExercicies.equipamentos.impressoras.Impressora;
import edu.luke.interfaceExercicies.equipamentos.multifuncional.EquipamentoDeMultiplaInterface;
import edu.luke.interfaceExercicies.equipamentos.copiadora.Copiadora;
import edu.luke.interfaceExercicies.equipamentos.digitalizadora.Digitalizadora;

public class testandoEquipamentos {
    public static void main(String[] args) {
        EquipamentoDeMultiplaInterface em = new EquipamentoDeMultiplaInterface();

        Impressora impressora = em;
        impressora.imprimir();

        Copiadora copiadora = em;
        copiadora.copiar();

        Digitalizadora digitalizadora = em;
        digitalizadora.digitalizar();
    }
}

package TreinoQualquer.test;

import TreinoQualquer.dominio.Medico;
import TreinoQualquer.dominio.Paciente;

public class MedicoTest01 {
    public static void main(String[] args) {
        Paciente patient1 = new Paciente("Carol");
        Paciente patient2= new Paciente("Rmerao");
        Paciente[] pacientes = {patient1, patient2};
        Medico doctor = new Medico("Jose augusto", pacientes);

     doctor.imprimeAiSabosta();
     
      
      

    }

}

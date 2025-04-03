package Main;


import ClaseAdapterDeObiecte.AdapterMedicament;
import ClaseAdapterDeObiecte.MedicamentFarmacie;
import ClaseAdapterDeObiecte.MedicamentSpital;

import static java.lang.Boolean.TRUE;

public class MainAdapterDeObiecte {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital("Nurofen",20);
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Paracetamol",15,TRUE,"10.10.2025");

        vindeMedicament(medicamentFarmacie);

        AdapterMedicament adapterMedicament = new AdapterMedicament(medicamentSpital);

        vindeMedicament(adapterMedicament);
    }
}
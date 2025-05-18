package ma.habbaz.hospital.service;

import ma.habbaz.hospital.entities.Consultation;
import ma.habbaz.hospital.entities.Medecin;
import ma.habbaz.hospital.entities.Patient;
import ma.habbaz.hospital.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}

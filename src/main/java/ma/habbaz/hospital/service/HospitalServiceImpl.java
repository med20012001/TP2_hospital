package ma.habbaz.hospital.service;

import jakarta.transaction.Transactional;
import ma.habbaz.hospital.entities.Consultation;
import ma.habbaz.hospital.entities.Medecin;
import ma.habbaz.hospital.entities.Patient;
import ma.habbaz.hospital.entities.RendezVous;
import ma.habbaz.hospital.repository.ConsultationRepository;
import ma.habbaz.hospital.repository.MedecinRepository;
import ma.habbaz.hospital.repository.PatientRepository;
import ma.habbaz.hospital.repository.RendezvousRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezvousRepository rendezvousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository,
                               MedecinRepository medecinRepository,
                               RendezvousRepository rendezvousRepository,
                               ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezvousRepository = rendezvousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {

        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezvousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}

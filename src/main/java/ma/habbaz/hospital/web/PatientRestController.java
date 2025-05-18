package ma.habbaz.hospital.web;

import ma.habbaz.hospital.entities.Patient;
import ma.habbaz.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestController {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> patientList() {
        return patientRepository.findAll();
    }
}
// cela si on consulte notre port "http://localhost:8086/patients" on va vois la liste des patients en format Json



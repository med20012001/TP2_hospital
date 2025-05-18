package ma.habbaz.hospital.repository;

import ma.habbaz.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezvousRepository extends JpaRepository<RendezVous, String> {
}

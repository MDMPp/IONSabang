package i.g.b.squadteam.IONS.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import i.g.b.squadteam.IONS.model.entity.Perizinan;
    
@Repository
public interface PerizinanRepository extends JpaRepository<Perizinan, Long> {

    //ambil data 1 row berdasarkan uuid
    Optional<Perizinan> findByUuidPerizinan(String uuidPerizinan);

    //ambil banyak row data berdasarkan kodeKantor
    Page<Perizinan> findAllByKodeKantorEquals(Pageable pageable, String kodeKantor);

    //ambil banyak row data berdasarkan npwp
    Page<Perizinan> findAllByNpwpContains(Pageable pageable, String npwp);
}

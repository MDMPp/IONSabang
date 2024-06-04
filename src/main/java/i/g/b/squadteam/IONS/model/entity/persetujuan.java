package i.g.b.squadteam.IONS.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "PERSETUJUAN")
public class persetujuan {
    

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no_aju;

    @Column(length = 36, unique = true)
    private String uuidPenugasan;

    @Column(nullable = false)
    private String lokasi_bongkar;

    @Column(nullable = false)
    private String lokasi_timbun;

    @Column(nullable = false)
    private String persetujuan;

    @Column(nullable = false)
    private Date tgl_tte;
}
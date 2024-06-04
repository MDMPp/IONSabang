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
@Entity(name = "PENUGASAN")
public class penugasan {
    

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no_aju;

    @Column(length = 36, unique = true)
    private String uuidPenugasan;

    @Column(nullable = false, unique = true)
    private String nip_1;

    @Column(nullable = false, unique = true)
    private String nip_2;

    @Column(nullable = false)
    private Date tanggal_mulai;

    @Column(nullable = false)
    private Date tanggal_selesai;

    @Column(nullable = false)
    private Date tgl_tte;
}

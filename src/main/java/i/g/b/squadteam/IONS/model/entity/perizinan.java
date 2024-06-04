package i.g.b.squadteam.IONS.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

// import apple.laf.JRSUIConstants.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "PERIZINAN")
public class perizinan {
  

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no_aju;

    @Column(length = 36, unique = true)
    private String uuidPerizinan;

    @Column(nullable = false)
    private Date tanggal_aju;

    @Column(length = 6)
    private String kode_kantor;

    @Column(nullable = false, length = 16)
    private String npwp;

    @Column(nullable = false, length = 30)
    private String no_permohonan;

    @Column(nullable = false, length = 30)
    private String dok_lain;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    @CreationTimestamp
    @Column(nullable = false)
    private Date wkRekam;
}

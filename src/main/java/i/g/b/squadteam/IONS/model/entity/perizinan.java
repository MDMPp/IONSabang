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
public class Perizinan {
  

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noAju;

    @Column(length = 36, unique = true)
    private String uuidPerizinan;

    @Column(nullable = false)
    private Date tanggalAju;

    @Column(length = 6)
    private String kodeKantor;

    @Column(nullable = false, length = 16)
    private String npwp;

    @Column(nullable = false, length = 30)
    private String rekom;

    @Column(nullable = false, length = 30)
    private String noPermohonan;

    @Column(nullable = true, length = 30)
    private String dokLain;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    @CreationTimestamp
    @Column(nullable = false)
    private Date wkRekam;
}

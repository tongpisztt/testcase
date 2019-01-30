package sut.se.G09.Backend.Entity;
import javax.persistence.*;
import lombok.*;
@Entity @Data
@Getter @Setter @ToString @EqualsAndHashCode
@Table(name = "Province")
public class Province {
  @Id
  @SequenceGenerator(name="province_seq",sequenceName="province_seq")
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="province_seq")
  @Column(name="PROVINCE_ID",unique = true, nullable = true)
  private Long iD;
  private String provinceName;
  public Province(){}


  public void setId(Long iD) {
    this.iD = iD;
  }

  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
  }

}
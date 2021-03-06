package sut.se.G09.Backend.Entity;
import javax.persistence.*;
import lombok.*;

@Entity @Data
@Getter @Setter
@Table(name = "DurationAppointment")
public class DurationAppointment {
  @Id
  @SequenceGenerator(name = "durationAppointment_seq", sequenceName = "durationAppointment_seq")
  @GeneratedValue(strategy = GenerationType   .SEQUENCE, generator = "durationAppointment_seq")
  private Long durationId;
  private String duration;

  public  DurationAppointment(){}
  public  DurationAppointment(Long durationId,String duration){
    this.durationId=durationId;
    this.duration=duration;
  }
  public Long getDurationId() {
    return durationId;
  }

  public void setDurationId(Long durationId) {
    this.durationId = durationId;
  }

  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

}
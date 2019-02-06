package sut.se.G09.Backend.Entity;
import javax.persistence.*;
import lombok.*;

@Entity @Data @Getter @Setter
@Table(name = "Category")
public class Category {
  @Id
  @SequenceGenerator(name = "Category_seq", sequenceName = "Category_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Category_seq")
  @Column(name = "CategoryId", unique = true, nullable = false, length = 100)
  private Long iD;
  private String typeName;

  public Long getId() {
    return iD;
  }

  public void setId(Long id) {
    this.iD = id;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName; }


}
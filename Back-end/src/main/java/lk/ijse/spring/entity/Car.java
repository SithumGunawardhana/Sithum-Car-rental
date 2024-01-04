package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Car {
    @Id

    private String regNo;
    private String brandName;
    private String modelName;
    private int noIOfPase;
    private String colour;
    private double dilyRate;
    private double monthlyRate;
    private double freeMi;
    private double extraKM;
    private String car_img;
    private String password;

//    @ManyToOne
//    @JoinColumn

 /////   private Rent



}

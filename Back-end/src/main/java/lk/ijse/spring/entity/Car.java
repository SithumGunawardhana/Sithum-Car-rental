package lk.ijse.spring.entity;

import lk.ijse.spring.embeded.Image;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Car {
    @Id

    private String regNumber;
    private String brand;
    private String model;
    private String type;
    private String transmission_type;
    private String fuel_type;


    @Embedded
    private Image image;
    private int noOfPassengers;
    private String color;
    private double daily_Rate;
    private double monthly_Rate;
    private double priceExtraKM;
    private double freeMileage;
    private String vehicleAvailabilityType;

//    @ManyToOne
//    @JoinColumn

 /////   private Rent



}

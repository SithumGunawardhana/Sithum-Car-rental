package lk.ijse.spring.dto;

import lk.ijse.spring.embeded.ImageDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class CarDTO {
    private String regNumber;
    private String brand;
    private String model;
    private String type;
    private String transmission_type;
    private String fuel_type;
    private ImageDTO image;
    private int noOfPassengers;
    private String color;
    private double daily_Rate;
    private double monthly_Rate;
    private double priceExtraKM;
    private double freeMileage;
    private String vehicleAvailabilityType;
}


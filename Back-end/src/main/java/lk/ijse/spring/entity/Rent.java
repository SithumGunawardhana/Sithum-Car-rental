package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.rmi.registry.LocateRegistry;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Rent {
    @Id
    private String rent_Id;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private LocalDate returnDate;
    private LocalTime returnTime;
    private String requestType;
    private String location;
    private String rentStatus;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "user_Id", referencedColumnName = "user_Id", nullable = false)
    private RegisterUser user_Id;

    @OneToMany(mappedBy = "rent", cascade = CascadeType.ALL)
    private List<RentDetails> rentDetails;

}

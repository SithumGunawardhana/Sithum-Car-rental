package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Driver {
    @Id
    private String user_Id;
    private String firstName;
    private String lastName;
    private String contact_No;
    private String address;
    private String email;
    private String nic;
    private String nic_Img;
    private String license_No;
    private String license_Img;
    private String availability;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

}

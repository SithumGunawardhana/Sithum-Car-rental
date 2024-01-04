package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Driver {
    @Id
private String driverId;
private String firstName;
private String lastName;
private String contactNO;
private String address;
private String email;
private String nicNo;
private String nic_img;
private String drivingLN;
private String dL_img;
private String userName;
private String password;
}

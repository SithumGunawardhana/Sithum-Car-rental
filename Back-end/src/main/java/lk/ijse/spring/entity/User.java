package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class User {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String contactNo;
    private String address;
    private String email;
    private String nicNo;
    private String nic_img;
    private String drivinLN;
    private String dL_img;
    private String password;




}

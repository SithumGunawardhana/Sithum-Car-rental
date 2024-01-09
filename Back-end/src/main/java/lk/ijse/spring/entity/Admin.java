package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class Admin {
    @Id
    private String user_Id;
    private String firstName;
    private String lastName;
    private String contact_No;
    private String address;
    private String email;
    private String nic;


    @OneToOne
    private User user;

}

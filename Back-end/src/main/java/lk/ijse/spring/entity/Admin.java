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
@Entity
@ToString
public class Admin {
    @Id
    private String nicNo;
    private String firstName;
    private String lastName;
    private int contactNo;
    private String email;
    private String userName;
    private String password;



}

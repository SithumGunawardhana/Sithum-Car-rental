package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.UserDTO;

import java.util.ArrayList;

public interface UserService {

    ArrayList<UserDTO> getAllRegisterUsers();

    UserDTO getRegisterUser(String username,String password);

    CustomDTO getSumCustomers();
}

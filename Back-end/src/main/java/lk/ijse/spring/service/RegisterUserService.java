package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.RegisterUserDTO;

import java.util.ArrayList;
import java.util.List;

public interface RegisterUserService {

    void saveRegisterUser(RegisterUserDTO dto);
    List<RegisterUserDTO> getAllRegisterUsers();
    RegisterUserDTO findRegisterUser(String id);
    void updateRegisterUser(RegisterUserDTO dto);
    void deleteRegisterUser(String id);
    ArrayList<RegisterUserDTO> searchUser(String user_id);
    CustomDTO userIdGenerate();
}

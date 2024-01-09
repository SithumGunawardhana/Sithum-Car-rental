package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CustomDTO;

import java.util.List;

public interface AdminService {


    void saveAdmin(AdminDTO dto);
    List<AdminDTO> getAllAdmin();
    void updateAdmin(AdminDTO dto);
    void deleteAdmin(String id);
    CustomDTO adminIdGenerate();
}

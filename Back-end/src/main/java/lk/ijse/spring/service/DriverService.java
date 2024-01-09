package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.DriverDTO;

import java.util.ArrayList;
import java.util.List;

public interface DriverService {

    void saveDriver(DriverDTO dto);
    List<DriverDTO> getAllDrivers();
    DriverDTO findDriver(String id);
    void updateDriver(DriverDTO dto);
    void deleteDriver(String id);
    ArrayList<DriverDTO> getAvailableDrivers();
    CustomDTO getSumDriver();
    CustomDTO getSumOfAvailableDrivers();
    CustomDTO getSumOfUnAvailableDrivers();
    CustomDTO driverIdGenerate();
    ArrayList<DriverDTO> searchDriver(String user_id);
}

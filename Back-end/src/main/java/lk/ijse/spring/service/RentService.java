package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.RentDTO;

import java.util.ArrayList;

public interface RentService {
    void rentCars(RentDTO dto);
    void updateRentCars(RentDTO dto);
    void rejectRentCars(RentDTO dto);
    CustomDTO getSumBookings();
    CustomDTO getSumOfPendingBookings();
    CustomDTO getSumOfActiveBookings();
    CustomDTO rentIdGenerate();
    ArrayList<RentDTO> getAllRent();
    void deleteRent(String id);
    RentDTO findRent(String id);
    ArrayList<RentDTO> getAcceptedRequest();
}

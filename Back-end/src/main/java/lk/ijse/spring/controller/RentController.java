package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.RentDTO;
import lk.ijse.spring.service.RentService;
import lk.ijse.spring.util.ResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/rentCar")
public class RentController {


    @Autowired
    RentService service;

    @PostMapping
    public ResponceUtil rentCar(@RequestBody RentDTO dto) {
        service.rentCars(dto);
        return new ResponceUtil("Ok", "Successfully Purchased.!", null);
    }

    @PostMapping(path = "/updateRent")
    public ResponceUtil updateRentCar(@RequestBody RentDTO dto) {
        service.updateRentCars(dto);
        return new ResponceUtil("Ok", "Request Accepted.!", null);
    }

    @PostMapping(path = "/rejectRent")
    public ResponceUtil rejectRentCar(@RequestBody RentDTO dto) {
        service.rejectRentCars(dto);
        return new ResponceUtil("Ok", "Request Rejected.!", null);
    }


    @GetMapping(path = "/sumOfRentsCount")
    public CustomDTO getSumBookings() {
        return service.getSumBookings();
    }

    @GetMapping(path = "/sumOfPendingBookingCount")
    public CustomDTO getSumOfPendingBookings() {
        return service.getSumOfPendingBookings();
    }
    @GetMapping(path = "/sumOfActiveBookingCount")
    public CustomDTO getSumOfActiveBookings() {
        return service.getSumOfActiveBookings();
    }

    @GetMapping(path = "/rentIdGenerate")
    public @ResponseBody CustomDTO rentIdGenerate() {
        return service.rentIdGenerate();
    }

    @GetMapping
    public ResponceUtil getAllRents() {
        return new ResponceUtil("OK", "Successfully Loaded. :", service.getAllRent());
    }

    @DeleteMapping(params = {"id"})
    public ResponceUtil deleteRent(String id){
        service.deleteRent(id);
        return new ResponceUtil("Ok","Successfully Deleted",null);
    }

    @GetMapping(params = {"id"})
    public ResponceUtil findRent(String id) {
        return new ResponceUtil("Ok", "Successfully Loaded", service.findRent(id));
    }

    @GetMapping(path = "/getAcceptedRequest")
    public @ResponseBody ArrayList<RentDTO> getAcceptedRequest() {
        return service.getAcceptedRequest();
    }

}

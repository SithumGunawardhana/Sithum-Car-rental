package lk.ijse.spring.controller;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.UserDTO;
import lk.ijse.spring.entity.User;
import lk.ijse.spring.service.AdminService;
import lk.ijse.spring.util.ResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("registerAdmin")
@CrossOrigin
public class AdminController {

    @Autowired
    AdminService service;

    @ResponseStatus(HttpStatus.OK)

    @PostMapping
    public ResponceUtil saveAdmin(@ModelAttribute AdminDTO dto, @ModelAttribute UserDTO userDTO){

        dto.setUser(userDTO);
        service.saveAdmin(dto);
        return new ResponceUtil("Ok", "Successfully Added", null);
    }


    @GetMapping
    public ResponceUtil getAllAdmin(){
        return new ResponceUtil("Ok", "Successfully Loaded", service.getAllAdmin());
    }

    @PostMapping(path={"update"})
    public ResponceUtil updateAdmin(@ModelAttribute AdminDTO dto, @ModelAttribute UserDTO userDTO){
        dto.setUser(userDTO);
        service.updateAdmin(dto);
        return new ResponceUtil("Ok", "Successfully Updated", null);
    }

    @DeleteMapping(params = {"id"})
    public ResponceUtil deleteAdmin(String id){
        service.deleteAdmin(id);
        return new ResponceUtil("Ok", "Successfully Deleted", null);
    }

    @GetMapping(path = "/adminIdGenerate")
    public CustomDTO adminIdGenerate(){
        return service.adminIdGenerate();
    }





}

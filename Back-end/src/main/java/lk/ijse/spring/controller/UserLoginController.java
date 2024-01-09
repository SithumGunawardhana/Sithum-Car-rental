package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CurrentUser;
import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.service.UserService;
import lk.ijse.spring.util.ResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class UserLoginController {

    @Autowired
    UserService service;
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil getAllRegisterUsers(){
        return new ResponceUtil("Ok","Successfully Loaded",service.getAllRegisterUsers());
    }

    @GetMapping(params = {"username"})
    public ResponceUtil setUser(String username,String password){
        CurrentUser.user = service.getRegisterUser(username,password);
        return new ResponceUtil("OK","Successfully Loaded..!","");
    }

    @GetMapping(path = "current")
    public ResponceUtil getCurrentUser(){
        return new ResponceUtil("OK","Successfully Loaded..!",CurrentUser.user);
    }

    @GetMapping(path = "/sumOfCustomersCount")
    public CustomDTO getSumCustomers() {
        return service.getSumCustomers();
    }

}

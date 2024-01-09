package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.PaymentDTO;
import lk.ijse.spring.service.PaymentService;
import lk.ijse.spring.util.ResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/payment")
public class PymentController {
    @Autowired
    PaymentService service;

    @PostMapping
    public ResponceUtil savePayment(@RequestBody PaymentDTO dto) {
        System.out.println(dto);
        service.savePayment(dto);
        return new ResponceUtil("OK", "Successfully Payment.!", null);
    }

    @GetMapping(path = "/paymentIdGenerate")
    public CustomDTO paymentIdGenerate() {
        return service.paymentIdGenerate();
    }

    @GetMapping
    public ResponceUtil getAllPayments() {
        return new ResponceUtil("OK", "Successfully Loaded. :", service.getAllPayments());
    }

}

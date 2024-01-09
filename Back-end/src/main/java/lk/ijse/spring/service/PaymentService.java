package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.PaymentDTO;

import java.util.ArrayList;

public interface PaymentService {

    void savePayment(PaymentDTO dto);
    CustomDTO paymentIdGenerate();
    ArrayList<PaymentDTO> getAllPayments();
}

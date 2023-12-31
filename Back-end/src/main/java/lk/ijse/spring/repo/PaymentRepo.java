package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PaymentRepo extends JpaRepository<Payment, String> {
    @Query(value = "SELECT payment_Id FROM Payment ORDER BY payment_Id DESC LIMIT 1", nativeQuery = true)
    String getLastID();

}

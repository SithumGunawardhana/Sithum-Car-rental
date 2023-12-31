package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface RentRepo extends JpaRepository<Rent, String> {

    @Query(value = "SELECT COUNT(rent_Id) FROM Rent", nativeQuery = true)
    int getSumBookings();

    @Query(value = "SELECT COUNT(rent_Id) FROM Rent WHERE rentStatus='REQUEST_PENDING';", nativeQuery = true)
    int getSumOfPendingBookings();

    @Query(value = "SELECT COUNT(rent_Id) FROM Rent WHERE rentStatus='PAYMENT_SUCCESS';", nativeQuery = true)
    int getSumOfActiveBookings();

    @Query(value = "SELECT rent_Id FROM Rent ORDER BY rent_Id DESC LIMIT 1", nativeQuery = true)
    String getLastID();

    @Query(value = "SELECT * FROM Rent WHERE rentStatus='REQUEST_ACCEPTED' ", nativeQuery = true)
    ArrayList<Rent> getAcceptedRequest();

}

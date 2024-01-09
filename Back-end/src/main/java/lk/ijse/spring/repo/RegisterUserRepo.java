package lk.ijse.spring.repo;

import lk.ijse.spring.entity.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface RegisterUserRepo extends JpaRepository<RegisterUser,String> {
    @Query(value = "select * from RegisterUser where user_id=? ",nativeQuery = true)
    ArrayList<RegisterUser> searchRegUser(String user_Id) throws RuntimeException;

    @Query(value = "SELECT user_Id FROM RegisterUser ORDER BY user_Id DESC LIMIT 1", nativeQuery = true)
    String getLastID();

}

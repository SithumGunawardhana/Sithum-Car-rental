package lk.ijse.spring.util;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponceUtil {
    private String state;
    private String message;
    private Object date;
}

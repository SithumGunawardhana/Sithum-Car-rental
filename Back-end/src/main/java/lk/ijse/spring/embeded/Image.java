package lk.ijse.spring.embeded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Image {

    private String front_view;
    private String back_view;
    private String side_view;
    private String interior_view;

}

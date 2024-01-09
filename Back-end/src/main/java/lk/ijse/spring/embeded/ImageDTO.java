package lk.ijse.spring.embeded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Embeddable;


@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ImageDTO {

    private MultipartFile front_view;
    private MultipartFile back_view;
    private MultipartFile side_view;
    private MultipartFile interior_view;
}

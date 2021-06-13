package io.project.app.account.dto;

/**
 *
 * @author gevorga
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author armena
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class PostDTO {

    private Long userId;
    private Long id;
    private String title;
    private String body;
}

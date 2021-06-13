package io.project.app.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author gevorga
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlbumsDTO {
    private Long userId;
    private Long id;
    private String title;
}

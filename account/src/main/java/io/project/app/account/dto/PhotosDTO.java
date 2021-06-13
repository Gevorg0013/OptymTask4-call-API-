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
public class PhotosDTO {
    private Long albumId;
    private String title;
    private String url;
}

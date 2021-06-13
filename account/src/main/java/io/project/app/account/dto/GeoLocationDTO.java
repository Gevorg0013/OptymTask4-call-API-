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
public class GeoLocationDTO {
    private String lat;
    private String lng;
}

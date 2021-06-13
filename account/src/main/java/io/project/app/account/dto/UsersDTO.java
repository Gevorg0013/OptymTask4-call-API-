package io.project.app.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author gevorga
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersDTO {
    private Long id;
    private String name;
    private String username;
    private String email;
    private AdressDTO address;
    private String phone;
    private String website;
    private CompanyDTO company;
}

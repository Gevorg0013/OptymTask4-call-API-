/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class CompanyDTO {
    private String name;
    private String catchPhrase;
    private String bs;
}

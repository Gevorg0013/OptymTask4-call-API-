package io.project.app.domain;

import java.io.Serializable;
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
public class Account implements Serializable {

   private Long userId;
   private Long id;
   private String title;
   private String body;
}

package io.project.app.repositories;

import io.project.app.domain.Account;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author armena
 */
@Transactional
@Repository
public interface AccountRepository extends MongoRepository<Account, String> {

    
    List<Account> findAll();
    

}

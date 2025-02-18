package java55.farm.auth.dao;
import java55.farm.auth.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

}

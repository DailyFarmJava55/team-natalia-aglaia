package java55.farm.auth_farm.dao;
import java55.farm.auth_farm.model.Farm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FarmRepository extends JpaRepository<Farm, String> {

    boolean existsByEmail(String email);
    Optional<Farm> findByEmail(String email);
}

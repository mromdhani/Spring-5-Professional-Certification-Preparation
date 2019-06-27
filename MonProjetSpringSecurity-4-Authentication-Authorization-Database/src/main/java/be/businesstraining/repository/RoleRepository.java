package be.businesstraining.repository;

import be.businesstraining.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByRole(String role);

}

package com.ominext.auth.repository;

import java.util.Optional;

import com.ominext.auth.models.ERole;
import com.ominext.auth.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}

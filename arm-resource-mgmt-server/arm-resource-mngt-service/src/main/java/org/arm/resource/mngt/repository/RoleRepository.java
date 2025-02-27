package org.arm.resource.mngt.repository;

import org.apache.catalina.User;
import org.arm.resource.mngt.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

}

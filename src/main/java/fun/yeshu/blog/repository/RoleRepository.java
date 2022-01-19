package fun.yeshu.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fun.yeshu.blog.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(String name);
}

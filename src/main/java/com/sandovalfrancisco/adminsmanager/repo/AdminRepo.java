package com.sandovalfrancisco.adminsmanager.repo;

import com.sandovalfrancisco.adminsmanager.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepo extends JpaRepository<Admin, Long> {
    Optional<Admin> findAdminById(Long id);
}

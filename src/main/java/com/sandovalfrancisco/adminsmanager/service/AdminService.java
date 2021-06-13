package com.sandovalfrancisco.adminsmanager.service;

import com.sandovalfrancisco.adminsmanager.exception.UserNotFoundException;
import com.sandovalfrancisco.adminsmanager.model.Admin;
import com.sandovalfrancisco.adminsmanager.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AdminService {
    private final AdminRepo adminRepo;

    @Autowired
    public AdminService(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }

    public Admin addAdmin(Admin admin){
        admin.setAdminCode(UUID.randomUUID().toString());
        return adminRepo.save(admin);
    }

    public List<Admin> findAllAdmin(){
        return adminRepo.findAll();
    }

    public Admin updateAdmin(Admin admin){
        return adminRepo.save(admin);
    }

    public Admin findAdminById(Long id){
        return adminRepo.findAdminById(id)
                .orElseThrow(()-> new UserNotFoundException("User by Id" + id + " not found"));
    }

    public void deleteAdmin(Long id){
        adminRepo.deleteById(id);
    }

}

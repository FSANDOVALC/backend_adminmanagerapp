package com.sandovalfrancisco.adminsmanager;

import com.sandovalfrancisco.adminsmanager.model.Admin;
import com.sandovalfrancisco.adminsmanager.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="admin")
public class AdminResource {
    private final AdminService adminService;

    public AdminResource(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Admin>> getAllAdmins(){
        List<Admin> admins = adminService.findAllAdmin();
        return new ResponseEntity<>(admins, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable("id") Long id){
        Admin admin = adminService.findAdminById(id);
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin){
        Admin newAdmin = adminService.addAdmin(admin);
        return new ResponseEntity<>(newAdmin, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin){
        Admin updateAdmin = adminService.updateAdmin(admin);
        return new ResponseEntity<>(updateAdmin, HttpStatus.OK);
    }

    @DeleteMapping(path="delete/{id}")
    public ResponseEntity<?> deleteAdmin(@PathVariable("id") Long id){
        adminService.deleteAdmin(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

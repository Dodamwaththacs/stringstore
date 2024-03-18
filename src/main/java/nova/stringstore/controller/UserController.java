package nova.stringstore.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/admin/createUser")
    @RolesAllowed("Admin")
    public ResponseEntity<String> createUser() {

        return ResponseEntity.ok("User created");
    }

    @GetMapping("/developer/createAdmin")
    @RolesAllowed("Developer")
    public ResponseEntity<String> createAdmin() {
        // Logic to create an admin
        return ResponseEntity.ok("Admin created");
    }
}

package com.josephadogeridev.warehouse.employee;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/message")
public class EmployeeController {

    @GetMapping("/hello")
    public ResponseEntity<String> greeting(){
        return ResponseEntity.ok("Hello World");
    }
    @GetMapping("/goodbye")
    public ResponseEntity<String> goodbye(){
        return ResponseEntity.ok("good bye");
    }

}

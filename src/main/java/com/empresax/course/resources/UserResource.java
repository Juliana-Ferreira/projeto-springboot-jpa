package com.empresax.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresax.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User userExample = new User(1L, "Airton Martins", "airton.martins@uol.com", "99999-9999", "senhaforte");
		return ResponseEntity.ok().body(userExample);
	}
}

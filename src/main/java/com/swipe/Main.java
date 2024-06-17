package com.swipe;

/**
 * True caller performs below functionality
 * 1. Store identity of a person against the phone number. -> takes input from a UI and stores it.
 * 2. When ever a user receives a call app looks to see if user is identifiable show name and spaced by and category also
 * 3. user can mark any caller as spam
 *
 *
 * API's
 *
 * 1. /users -> Name, email, phone
 * 2. /identity -> phone | user
 * 3. /block -> user1 , user2 | boolean
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
	public static void main(String... args) {
		SpringApplication.run(Main.class, args);
	}
}


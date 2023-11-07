package com.razvan.managementsys.exception;

/**
 * @author Simpson Alfred
 */

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

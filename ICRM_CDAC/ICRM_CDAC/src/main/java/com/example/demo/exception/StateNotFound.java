package com.example.demo.exception;

public class StateNotFound extends RuntimeException {
    public StateNotFound(Integer id) {
        super(String.format("State with id %d not found", id));
    }
}

package main.java.com.example.demo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class ErrorResponse {
    private int code;
    private String message;
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.springboot2.requests;

import javax.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author lucas
 */
@Data
@Builder
public class AnimePostRequestBody {
    
    @NotEmpty(message = "The anime name cannot be empty")
    String name;
    
}

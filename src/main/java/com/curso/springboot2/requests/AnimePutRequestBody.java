/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.springboot2.requests;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author lucas
 */
@Data
@Builder
public class AnimePutRequestBody {

    private Long id;
    private String name;

}

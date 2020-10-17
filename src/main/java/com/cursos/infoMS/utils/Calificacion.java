package com.cursos.infoMS.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calificacion {
    int course_id;
    float course_score;
}
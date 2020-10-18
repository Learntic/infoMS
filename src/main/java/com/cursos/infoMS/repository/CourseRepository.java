package com.cursos.infoMS.repository;

import com.cursos.infoMS.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CourseRepository extends JpaRepository<Curso, Integer> {

    @Query(value = "select * from course where course_id = ?1", nativeQuery = true)
    List<Curso> infoCurso(int course_id);

    @Query(value = "select course_name from course where course_id = ?1", nativeQuery = true)
    String nombreCurso(Integer course_id);

    @Query(value = "select * from course", nativeQuery = true)
    List<Curso> listaCursos();

    @Query(value = "SELECT * FROM course where course_name like ?1 or course_description like ?1", nativeQuery = true)
    List<Curso> buscarCurso(String palabra);

    @Transactional
    @Modifying
    @Query(value = "UPDATE course SET course_score = ?1 WHERE course_id=?2", nativeQuery = true)
    Integer updateCourseScore(Float course_score, Integer course_id);

}

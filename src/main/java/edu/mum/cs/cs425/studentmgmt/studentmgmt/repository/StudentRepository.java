package edu.mum.cs.cs425.studentmgmt.studentmgmt.repository;

import edu.mum.cs.cs425.studentmgmt.studentmgmt.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

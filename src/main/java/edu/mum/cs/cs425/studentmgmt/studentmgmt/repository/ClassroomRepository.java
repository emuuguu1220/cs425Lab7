package edu.mum.cs.cs425.studentmgmt.studentmgmt.repository;

import edu.mum.cs.cs425.studentmgmt.studentmgmt.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}

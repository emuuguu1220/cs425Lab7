package edu.mum.cs.cs425.studentmgmt.studentmgmt.repository;

import edu.mum.cs.cs425.studentmgmt.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.studentmgmt.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranscriptRepository  extends JpaRepository<Transcript, Long> {
}

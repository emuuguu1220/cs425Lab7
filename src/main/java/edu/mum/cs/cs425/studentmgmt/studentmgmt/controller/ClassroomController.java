package edu.mum.cs.cs425.studentmgmt.studentmgmt.controller;

import edu.mum.cs.cs425.studentmgmt.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.studentmgmt.repository.ClassroomRepository;
import edu.mum.cs.cs425.studentmgmt.studentmgmt.repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClassroomController {

    @Autowired
    private ClassroomRepository classroomRepository;

    @GetMapping("/classrooms")
    public List<Classroom> getAllClassrooms() {
        return classroomRepository.findAll();
    }

    @PostMapping("/classrooms")
    public Classroom createTranscript(@Valid @RequestBody Classroom classroom) {
        return classroomRepository.save(classroom);
    }

}

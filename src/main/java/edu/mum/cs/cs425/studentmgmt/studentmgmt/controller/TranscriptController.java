package edu.mum.cs.cs425.studentmgmt.studentmgmt.controller;

import edu.mum.cs.cs425.studentmgmt.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.studentmgmt.repository.StudentRepository;
import edu.mum.cs.cs425.studentmgmt.studentmgmt.repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")

public class TranscriptController {
    @Autowired
    private TranscriptRepository transcriptRepository;

    @GetMapping("/transcripts")
    public List<Transcript> getAllTranscripts() {
        return transcriptRepository.findAll();
    }

    @PostMapping("/transcripts")
    public Transcript createTranscript(@Valid @RequestBody Transcript transcript) {
        return transcriptRepository.save(transcript);
    }
}

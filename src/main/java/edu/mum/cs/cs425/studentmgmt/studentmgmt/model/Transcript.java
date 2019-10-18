package edu.mum.cs.cs425.studentmgmt.studentmgmt.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "transcript")
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transcriptID;

    @NotBlank
    private String degreeTitle;

    @OneToOne(mappedBy = "transcript")
    private Student student;

    public Transcript() {
    }

    public Transcript(String degreeTitle, Student student) {
        this.degreeTitle = degreeTitle;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Long getTranscriptID() {
        return transcriptID;
    }

    public void setTranscriptID(Long transcriptID) {
        this.transcriptID = transcriptID;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }
}

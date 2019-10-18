package edu.mum.cs.cs425.studentmgmt.studentmgmt.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "classroom")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classroomID;

    private String buildingName;

    private Integer roomNo;

    @OneToMany(mappedBy = "classroom")
    private List<Student> students =
            new ArrayList<Student>();
    public Classroom() {
    }

    public Classroom(String buildingName, Integer roomNo, List<Student> students) {
        this.buildingName = buildingName;
        this.roomNo = roomNo;
        this.students=students;
    }

    public Long getClassroomID() {
        return classroomID;
    }

    public void setClassroomID(Long classroomID) {
        this.classroomID = classroomID;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        this.roomNo = roomNo;
    }
}

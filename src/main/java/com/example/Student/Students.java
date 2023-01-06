package com.example.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
@Entity

public class Students {

    @Id
    @Column(name = "rollNo", nullable = false)
    int rollNo;

    @Column(name = "name",nullable = false)
    String name;

    @Column(name = "age",nullable = false)
    int age;

    @Column(name = "city",nullable = false)
    String city;

    @Column(name = "hobby")
    String hobby;
}

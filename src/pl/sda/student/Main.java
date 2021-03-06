package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student student = new Student("Jan", "Kowalski", 32 );
        Student student1 = new Student ("Piotr", "Lis", 21);
        Student student2 = new Student("Paweł", "Nowak", 23);
        Student student3 = new Student("Tomasz", "Wilk", 40);
        Student student4 = new Student("Zbigniew", "Gawron",60);
        Student student5 = new Student("Aleksander", "Kwaśnik" ,53);

        ObjectMapper objectMapper = new ObjectMapper();
        List<Student> studentlist = new ArrayList<>();
        studentlist.add(student);
        studentlist.add(student1);
        studentlist.add(student2);
        studentlist.add(student3);
        studentlist.add(student4);
        studentlist.add(student5);

        try {
            objectMapper.writeValue (new File("student.json"), student);
            objectMapper.writeValue(new File("student1.json"), student1);
            objectMapper.writeValue(new File("student2.json"), student2);
            objectMapper.writeValue(new File("student3.json"), student3);
            objectMapper.writeValue(new File("student4.json"), student4);
            objectMapper.writeValue(new File("student5.json"), student5);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

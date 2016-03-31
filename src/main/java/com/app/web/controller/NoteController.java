package com.app.web.controller;

import com.app.domain.Note;
import com.app.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    NoteRepository noteRepository;

    @RequestMapping("/{id}")
    public Note getNote(@PathVariable int id){
        return noteRepository.findOne(id);
    }
}

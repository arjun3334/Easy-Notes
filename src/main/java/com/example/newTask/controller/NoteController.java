package com.example.newTask.controller;

import com.example.newTask.Service.NoteService;
import com.example.newTask.Service.UserService;
import com.example.newTask.convert.NoteConvertService;
import com.example.newTask.dto.NoteDto;
import com.example.newTask.model.Note;
import com.example.newTask.model.User;
import com.example.newTask.repository.NoteResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
        @RequestMapping(value = "/api")
public class NoteController {
public  final NoteConvertService noteConvertService;
  public final NoteService noteService;
@Autowired
    public NoteController(NoteConvertService noteConvertService, NoteService noteService) {
    this.noteConvertService = noteConvertService;
    this.noteService = noteService;
    }

    @GetMapping(value = "/test")
    public List<Note> findAll(){
        return noteService.findAllNotes();
    }

    @PutMapping(value = "/notes/update/{id}")
    public NoteResource update(@PathVariable(value = "id")Long Id,
                               @RequestBody NoteDto noteDto){
        return noteConvertService.convertNote(noteService.updateNote(noteDto,Id));
    }

    @GetMapping(value = "/notes/{id}")
    public Note getNoteByID(@PathVariable(value = "id")Long Id){
    return noteService.findById(Id);
    }

@PostMapping(value = "/addNewNote")
         public NoteResource addNewNote(@RequestBody NoteDto noteDto){
    return noteConvertService.convertNote(noteService.addNewNotes(noteDto));
}






    //arjun3334
}


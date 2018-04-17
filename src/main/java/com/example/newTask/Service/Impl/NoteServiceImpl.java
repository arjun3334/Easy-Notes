package com.example.newTask.Service.Impl;

import com.example.newTask.Service.NoteService;
import com.example.newTask.Service.UserService;
import com.example.newTask.dto.NoteDto;
import com.example.newTask.model.Note;
import com.example.newTask.model.Status;
import com.example.newTask.model.User;
import com.example.newTask.repository.NoteRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Setter
@Getter
@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;
    private final UserService userService;
    @Autowired
    public NoteServiceImpl(NoteRepository noteRepository, UserService userService) {
        this.noteRepository = noteRepository;
        this.userService = userService;
    }

    @Override
    public List<Note> findAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note findById(Long id) {
        return noteRepository.findById(id)
                .orElseThrow(()-> new com.example.newTask.exception.ResourceNotFoundException("Note","id",id));

    }

    @Override
    public Note updateNote(NoteDto noteDto, Long id) {
        Note note=noteRepository.findById(id)
                .orElseThrow(()->new com.example.newTask.exception.ResourceNotFoundException("Note","id",id));
        note.setTitle(noteDto.getTitle());
        note.setContent(noteDto.getContent());

        return noteRepository.save(note);
    }

    @Override
    public Note addNewNotes(NoteDto noteDto) {
        Note note=new Note();
        note.setContent(noteDto.getContent());
        note.setTitle(noteDto.getTitle());
        note.setStatus(Status.ACTIVE);
        return noteRepository.save(note);
    }


}

   /* @Override
    public List<Note> findAllNotes() {
        return null;
    }*/



package com.example.newTask.convert;

import com.example.newTask.model.Note;
import com.example.newTask.repository.NoteResource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteConvertServicempl implements NoteConvertService{
    @Override

    public NoteResource convertNote(Note note) {
/*
        Note note=new Note();
        note.setContent(noteDto.getContent());*/


        NoteResource noteResource= new NoteResource();

        noteResource.setContent(note.getContent());;

        noteResource.setCreatedDate(note.getCreatedAt());
        noteResource.setTitle(note.getTitle());
        noteResource.setNoteId(note.getId());
       return noteResource;
         /* return      noteResource.builder().content(note.getContent())
                .createdDate(note.getCreatedAt())
                .noteId(note.getId())
                .title(note.getTitle())
                .build();*/
    }

    @Override
    public List<NoteResource> convertList(List<Note> notesByTitle) {
        List<NoteResource> noteResourceList= new ArrayList<>();
        for (Note note:notesByTitle){
            noteResourceList.add(convertNote(note));
        }
        return noteResourceList;
    }
}

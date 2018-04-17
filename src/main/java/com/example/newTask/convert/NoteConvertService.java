







package com.example.newTask.convert;

import com.example.newTask.model.Note;
import com.example.newTask.repository.NoteResource;

import java.util.List;

public interface NoteConvertService {
    NoteResource convertNote(Note note);

    List<NoteResource> convertList(List<Note> notesByTitle);
}


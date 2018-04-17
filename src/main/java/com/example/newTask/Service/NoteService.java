





package com.example.newTask.Service;

import com.example.newTask.dto.NoteDto;
import com.example.newTask.model.Note;
import com.example.newTask.repository.NoteResource;
import org.springframework.stereotype.Service;

import java.util.List;

public interface NoteService {
   /* List<Note> findall() {
        Note getallNotes;
    }*/

    List<Note> findAllNotes();

    Note findById(Long id);

    Note updateNote(NoteDto noteDto, Long id);

    Note addNewNotes(NoteDto noteDto);


    //Note addNewNote(NoteDto noteDto);

}



   /* List<Note> findall() {

        Note getallNotes();
    }*/


//List<Note> findall();

//<T> Optional<T>
    /*Optional<Note> findById(Long noteId);
}
*/
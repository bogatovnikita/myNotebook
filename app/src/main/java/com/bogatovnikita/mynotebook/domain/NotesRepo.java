package com.bogatovnikita.mynotebook.domain;

import java.util.List;

public interface NotesRepo {

    List<NoteEntity> getNotes();

    void deleteNotes(Integer id);

    void createNotes(NoteEntity note);
}

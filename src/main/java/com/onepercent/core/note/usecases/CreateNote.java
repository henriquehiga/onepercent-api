package com.onepercent.core.note.usecases;

import com.onepercent.core.note.Note;
import com.onepercent.core.note.dtos.CreateNoteDTO;
import com.onepercent.core.note.enums.NoteKind;
import com.onepercent.core.note.repository.NoteRepository;
import com.onepercent.core.note.usecases.dtos.CreateNoteInputDTO;

public class CreateNote {
    private NoteRepository noteRepository;

    public CreateNote(
            NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public void execute(CreateNoteInputDTO createNoteInput) {
        CreateNoteDTO createNoteDTO = new CreateNoteDTO(
                createNoteInput.priorityId(),
                NoteKind.valueOf(createNoteInput.kind()),
                createNoteInput.description());

        Note note = Note.create(createNoteDTO);

        this.noteRepository.save(note);
    }
}

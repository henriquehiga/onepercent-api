package com.onepercent.core.note;

import java.sql.Date;
import java.util.UUID;

import com.onepercent.core.note.dtos.CompleteNoteDTO;
import com.onepercent.core.note.dtos.CreateNoteDTO;
import com.onepercent.core.note.enums.NoteKind;

import lombok.Getter;

@Getter()
public class Note {
    private String id;
    private String priorityId;
    private NoteKind kind;
    private String description;
    private Boolean completed;
    private Date completedAt;
    private Date createdAt;

    private Note(
            String id,
            String priorityId,
            NoteKind kind,
            String description,
            Boolean completed,
            Date completedAt,
            Date createdAt) {
        this.id = id;
        this.priorityId = priorityId;
        this.kind = kind;
        this.description = description;
        this.completed = completed;
        this.completedAt = completedAt;
        this.createdAt = createdAt;
    }

    public static Note create(
            CreateNoteDTO createNoteDTO) {
        String id = new UUID(0, 0).toString();
        Date createdAt = new Date(0);
        return new Note(id, createNoteDTO.priorityId(), createNoteDTO.kind(), createNoteDTO.description(), false, null,
                createdAt);
    }

    public static Note mount(
            CompleteNoteDTO completeNoteDTO) {
        return new Note(completeNoteDTO.id(), completeNoteDTO.priorityId(), completeNoteDTO.kind(),
                completeNoteDTO.description(),
                completeNoteDTO.completed(),
                completeNoteDTO.completedAt(),
                completeNoteDTO.createdAt());
    }
}

package com.onepercent.core.note.dtos;

import java.sql.Date;

import com.onepercent.core.note.enums.NoteKind;

public record CompleteNoteDTO(
                String id,
                String priorityId,
                NoteKind kind,
                String description,
                Boolean completed,
                Date completedAt,
                Date createdAt) {
}

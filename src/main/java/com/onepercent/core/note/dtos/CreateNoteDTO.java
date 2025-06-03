package com.onepercent.core.note.dtos;

import com.onepercent.core.note.enums.NoteKind;

public record CreateNoteDTO(
                String priorityId,
                NoteKind kind,
                String description) {
}

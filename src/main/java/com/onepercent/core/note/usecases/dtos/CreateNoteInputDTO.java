package com.onepercent.core.note.usecases.dtos;

public record CreateNoteInputDTO(
        String priorityId,
        String kind,
        String description) {
}

package com.onepercent.core.note.enums;

public enum NoteKind {
    OBSERVATION,
    TODO;

    public static NoteKind GetValue(String string) {
        return NoteKind.valueOf(string.toUpperCase());
    }
}

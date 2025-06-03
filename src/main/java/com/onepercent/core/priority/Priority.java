package com.onepercent.core.priority;

import java.sql.Date;
import java.util.UUID;

import com.onepercent.core.priority.dtos.CompletePriorityDTO;
import com.onepercent.core.priority.dtos.NewPriorityDTO;

import lombok.Getter;

@Getter()
public class Priority {
    private String id;
    private String description;
    private Date createdAt;

    private Priority(
            String id,
            String description,
            Date createdAt) {
        this.id = id;
        this.description = description;
        this.createdAt = createdAt;
    }

    public static Priority create(
            NewPriorityDTO newPriorityDTO) {
        String id = new UUID(0, 0).toString();
        return new Priority(id, newPriorityDTO.description(), newPriorityDTO.createdAt());
    }

    public static Priority mount(
            CompletePriorityDTO completePriorityDTO) {
        return new Priority(completePriorityDTO.id(), completePriorityDTO.description(),
                completePriorityDTO.createdAt());
    }
}

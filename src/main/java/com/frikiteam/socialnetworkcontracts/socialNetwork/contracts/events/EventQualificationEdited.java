package com.frikiteam.socialnetworkcontracts.socialNetwork.contracts.events;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class EventQualificationEdited {
    private String commentId;
    private String content;
    private Instant occurredOn;

    public EventQualificationEdited() {
    }


    public EventQualificationEdited(String commentId, String content, Instant occurredOn) {
        this.commentId = commentId;
        this.content = content;
        this.occurredOn = occurredOn;
    }
}

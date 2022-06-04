package com.frikiteam.socialnetworkcontracts.socialNetwork.contracts.events;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class EventQualificationRegistered {
    private String commentId;
    private String content;
    private Instant occurredOn;

    public EventQualificationRegistered() {
    }

    public EventQualificationRegistered(String commentId, String content, Instant occurredOn) {
        this.commentId = commentId;
        this.content = content;
        this.occurredOn = occurredOn;
    }
}

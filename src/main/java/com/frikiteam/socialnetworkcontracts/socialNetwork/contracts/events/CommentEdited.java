package com.frikiteam.socialnetworkcontracts.socialNetwork.contracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class CommentEdited {
    private String commentId;
    private String content;
    private Instant occurredOn;
}

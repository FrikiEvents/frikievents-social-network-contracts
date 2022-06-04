package com.frikiteam.socialnetworkcontracts.socialNetwork.contracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class CommentRegistered {
    private String commentId;
    private String content;
}

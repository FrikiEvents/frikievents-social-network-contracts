package com.frikiteam.socialnetworkcontracts.socialNetwork.contracts.commands;


import lombok.Getter;
import lombok.Setter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Getter
@Setter
public class EditComment {
    @TargetAggregateIdentifier
    private String commentId;
    private String content;

    public EditComment() {
    }

    public EditComment(String commentId, String content) {
        this.commentId = commentId;
        this.content = content;
    }
}

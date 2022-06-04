package com.frikiteam.socialnetworkcontracts.socialNetwork.contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class RegisterComment {
    @TargetAggregateIdentifier
    private String commentId;
    private String content;
}

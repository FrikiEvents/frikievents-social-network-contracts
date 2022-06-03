package com.frikiteam.socialnetworkcontracts.socialNetwork.contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class EditEventQualification {
    @TargetAggregateIdentifier
    private String eventQualificationId;
    private int starsQuantity;
}

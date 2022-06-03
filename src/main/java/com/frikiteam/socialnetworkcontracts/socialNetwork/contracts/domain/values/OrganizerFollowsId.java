package com.frikiteam.socialnetworkcontracts.socialNetwork.contracts.domain.values;

import lombok.Value;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Value(staticConstructor = "of")
public class OrganizerFollowsId implements Serializable {
    private UUID id;

    public OrganizerFollowsId(UUID id) {
        this.id = id;
    }

    public OrganizerFollowsId() {
        this.id = UUID.randomUUID();
    }


}

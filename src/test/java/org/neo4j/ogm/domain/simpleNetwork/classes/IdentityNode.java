/*
 * Copyright (c) 2002-2015 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with
 * separate copyright notices and license terms. Your use of the source
 * code for these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 *
 */
package org.neo4j.ogm.domain.simpleNetwork.classes;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.domain.simpleNetwork.abstractions.AbstractIdentityNode;

import java.util.Set;

/**
 * @author vince
 */
@NodeEntity(label="IdentityNode")
public class IdentityNode extends AbstractIdentityNode<TimeRelation> {

    @Relationship(direction="OUTGOING", type="IDENTITY_STATE")
    private Set<TimeRelation> identityStates;

    @Override
    public Set<TimeRelation> getStates() {
        return identityStates;
    }

    @Override
    public void setStates(Set<TimeRelation> states) {
        this.identityStates = states;
    }
}

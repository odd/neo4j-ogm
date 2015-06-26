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

package org.neo4j.ogm.entityaccess;

/**
 * Specialisation of {@link PropertyWriter} that also exposes the relationship type represented by the corresponding
 * object member.
 *
 * @author Adam George
 */
public interface RelationalWriter extends PropertyWriter {

    String relationshipName();

    String relationshipDirection();

    boolean forScalar();
}

/**
 * Copyright (c) 2018, 2019 Red Hat Inc and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package de.dentrassi.iot.hono.bridge;

import org.apache.camel.component.amqp.AMQPConnectionDetails;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Context {

    private @Value("${amqp.uri}") String amqpUri;
    private @Value("${amqp.username}") String amqpUsername;
    private @Value("${amqp.password}") String amqpPassword;

    @Bean
    public AMQPConnectionDetails amqpConnection() {
        return new AMQPConnectionDetails(this.amqpUri, this.amqpUsername, this.amqpPassword);
    }
}

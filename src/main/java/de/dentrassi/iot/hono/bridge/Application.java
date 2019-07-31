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

import java.security.Security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import de.dentrassi.crypto.pem.PemKeyStoreProvider;

@SpringBootApplication
@ImportResource("classpath:main.xml")
public class Application {

    public static void main(final String[] args) {
        Security.addProvider(new PemKeyStoreProvider());

        SpringApplication.run(Application.class, args);
    }

}

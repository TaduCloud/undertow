/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.undertow;

import java.util.Properties;

/**
 * @author <a href="mailto:tomaz.cerar@redhat.com">Tomaz Cerar</a> (c) 2013 Red Hat Inc.
 */
public class Version {
    private static final String versionString;
    private static final String SERVER_NAME = "Undertow";
    private static final String fullVersionString;

    static {
        String version = "Unknown";
        try {
            Properties props = new Properties();
            props.load(Version.class.getResourceAsStream("version.properties"));
            version = props.getProperty("undertow.version");
        } catch (Exception e) {
            e.printStackTrace();
        }
        versionString = version;
        fullVersionString = SERVER_NAME + " - "+ versionString;
    }

    public static String getVersionString() {
        return versionString;
    }

    public static String getFullVersionString() {
        return fullVersionString;
    }
}

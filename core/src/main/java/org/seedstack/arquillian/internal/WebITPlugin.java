/*
 * Copyright © 2013-2018, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.arquillian.internal;

import org.seedstack.seed.core.internal.AbstractSeedPlugin;

public class WebITPlugin extends AbstractSeedPlugin {
    @Override
    public String name() {
        return "web-testing";
    }

    @Override
    public Object nativeUnitModule() {
        return new WebITModule();
    }
}

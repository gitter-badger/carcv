/*
 * Copyright 2012-2014 CarCV Development Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.carcv.core.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test for {@link Speed}.
 */
public class SpeedTest {

    /**
     * Test method for {@link org.carcv.core.model.Speed#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObject() {
        Speed s1 = new Speed(80.2, SpeedUnit.KPH);
        assertEquals(s1, s1);

        Speed s2 = new Speed(80.2, SpeedUnit.KPH);
        assertEquals(s1, s2);

        s2 = new Speed(80.2, SpeedUnit.MPH);

        assertNotEquals(s1, s2);

        s1 = new Speed(80.15, SpeedUnit.KPH);
        s2 = new Speed(80.2, SpeedUnit.KPH);

        assertNotEquals(s1, s2);
    }
}

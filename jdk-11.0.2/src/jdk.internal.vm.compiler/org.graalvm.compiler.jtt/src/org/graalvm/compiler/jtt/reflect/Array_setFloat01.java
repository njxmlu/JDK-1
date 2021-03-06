/*
 * Copyright (c) 2007, 2012, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
/*
 */


package org.graalvm.compiler.jtt.reflect;

import java.lang.reflect.Array;

import org.junit.Test;

import org.graalvm.compiler.jtt.JTTTest;

public class Array_setFloat01 extends JTTTest {

    private static final float[] array = {-1, -1, -1};

    public static float test(int i, float value) {
        Array.setFloat(array, i, value);
        return array[i];
    }

    @Test
    public void run0() throws Throwable {
        runTest("test", 0, 11.1f);
    }

    @Test
    public void run1() throws Throwable {
        runTest("test", 1, 21.1f);
    }

    @Test
    public void run2() throws Throwable {
        runTest("test", 0, 42.1f);
    }

    @Test
    public void run3() throws Throwable {
        runTest("test", 3, 0.1f);
    }

}

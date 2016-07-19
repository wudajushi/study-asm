package org.zr.study.asm.utilstest;

import org.junit.Test;
import org.objectweb.asm.Type;

/**
 * Created by dell on 2016/7/19.
 */
public class TypeTest {
    @Test
    public void test1() {
        Type type = Type.getType(Thread.class);
        System.out.println(type.getDescriptor());
        System.out.println(type.getInternalName());
    }

    @Test
    public void test2() {
        Type type = Type.getType(Object.class);
        System.out.println(type.getDescriptor());
        System.out.println(type.getInternalName());
    }
}

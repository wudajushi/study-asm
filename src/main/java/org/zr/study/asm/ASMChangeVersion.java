package org.zr.study.asm;

/**
 * Created by dell on 2016/7/19.
 */

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

public class ASMChangeVersion {
    public static void main(String[] args) throws Exception {
        ClassReader reader = new ClassReader("java/lang/Thread");
        ClassWriter writer = new ClassWriter(0);
        ASMChangeVersionAdapter changeVersionAdapter = new ASMChangeVersionAdapter(writer);
        reader.accept(changeVersionAdapter, 0);
        OutputUtils.outputClassToPath(writer.toByteArray());
    }
}

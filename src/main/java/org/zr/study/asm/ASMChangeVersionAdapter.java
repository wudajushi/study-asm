package org.zr.study.asm;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import static org.objectweb.asm.Opcodes.*;

/**
 * 改变class的版本
 */
public class ASMChangeVersionAdapter extends ClassVisitor {
    public ASMChangeVersionAdapter(ClassWriter cw) {
        super(ASM5, cw);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(V1_6, access, name, signature, superName, interfaces);
    }
}

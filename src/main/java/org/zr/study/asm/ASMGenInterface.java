package org.zr.study.asm;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.PrintWriter;

import static org.objectweb.asm.Opcodes.*;

public class ASMGenInterface {
    public static void main(String[] args) {
        ClassWriter cw = new ClassWriter(0);
        PrintWriter printWriter = new PrintWriter(System.out);
        TraceClassVisitor tcv = new TraceClassVisitor(cw, printWriter);
        tcv.visit(V1_8, ACC_PUBLIC + ACC_INTERFACE, "zr/MyRunnable", null, null, new String[]{"java/lang/Runnable", "java/lang/Comparable"});
        tcv.visitEnd();
        byte[] clazz = cw.toByteArray();
        OutputUtils.outputClassToPath(clazz);
    }
}

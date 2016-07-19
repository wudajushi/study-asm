package org.zr.study.asm;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.PrintWriter;

import static org.objectweb.asm.Opcodes.*;

/**
 * Created by dell on 2016/7/19.
 */
public class ASMGenConstants {
    public static void main(String[] args) {
        ClassWriter cw = new ClassWriter(0);
        TraceClassVisitor tcv = new TraceClassVisitor(cw, new PrintWriter(System.out));
        tcv.visit(V1_7, ACC_PUBLIC, "zr/TestConstants", null, "java/lang/Object", null);
        tcv.visitField(ACC_PUBLIC + ACC_STATIC + ACC_FINAL, "CONSTANTS_ONE", "I", null, 1).visitEnd();
        tcv.visitField(ACC_PUBLIC + ACC_STATIC + ACC_FINAL, "NAME", "Ljava/lang/String;", null, "ASM5").visitEnd();
        tcv.visitField(ACC_PUBLIC + ACC_STATIC + ACC_FINAL, "IS_YES", "Z", null, false).visitEnd();
        tcv.visitEnd();
        OutputUtils.outputClassToPath(cw.toByteArray());
    }
}

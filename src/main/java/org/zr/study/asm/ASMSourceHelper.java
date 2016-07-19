package org.zr.study.asm;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.util.ASMifier;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.PrintWriter;

/**
 * 这个类可以看如何生成一个类的ASM源代码
 */
public class ASMSourceHelper {
    public static void main(String[] args) throws Exception {
        ClassReader cr = new ClassReader("java/util/concurrent/ConcurrentHashMap");
        ClassWriter cw = new ClassWriter(0);
        TraceClassVisitor tcv = new TraceClassVisitor(cw, new ASMifier(), new PrintWriter(System.out));
        cr.accept(tcv, 0);
    }
}

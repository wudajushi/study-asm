package org.zr.study.asm;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.util.CheckClassAdapter;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.PrintWriter;

import static org.objectweb.asm.Opcodes.*;

/**
 * Created by dell on 2016/7/19.
 */
public class ASMCheckClassAdapterTest {
    public static void main(String[] args) {
        try {
            ClassWriter classWriter = new ClassWriter(0);
            TraceClassVisitor traceClassVisitor = new TraceClassVisitor(classWriter, new PrintWriter(System.out));
            CheckClassAdapter checkClassAdapter = new CheckClassAdapter(traceClassVisitor);
            checkClassAdapter.visit(V1_7, ACC_PUBLIC + ACC_FINAL + ACC_PRIVATE, "TestCheck", null, "java/lang/Object", null);
            checkClassAdapter.visitEnd();
            OutputUtils.outputClassToPath(classWriter.toByteArray());
        }catch(Exception e){
            //expected exception
            e.printStackTrace();
        }
    }
}

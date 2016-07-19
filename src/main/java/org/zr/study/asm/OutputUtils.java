package org.zr.study.asm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by dell on 2016/7/19.
 */
public class OutputUtils {
    private static final String defaultPath = "D:\\asmwork";

    static {
        File dir = new File(defaultPath);
        if(!dir.exists()) {
            dir.mkdirs();
        }
    }

    public static void outputClassToPath(byte[] clazzBytes) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(defaultPath + "\\GenereteClass.class");
            fos.write(clazzBytes);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(fos != null) {
                try {
                    fos.flush();
                } catch(IOException e) {
                }
                try {
                    fos.close();
                } catch(IOException e) {
                }
            }
        }
    }
}

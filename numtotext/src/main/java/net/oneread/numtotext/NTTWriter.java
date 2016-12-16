package net.oneread.numtotext;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * ---------------------------------------------------
 * Created by Sermilion on 16/12/2016.
 * Project: Library
 * ---------------------------------------------------
 * <a href="http://www.ucomplex.org">ucomplex.org</a>
 * <a href="http://www.github.com/sermilion>github</a>
 * ---------------------------------------------------
 */

public class NTTWriter {

    private PrintWriter writer = null;

    public NTTWriter(String filename){
        openWriter(filename);
    }


    private void openWriter(String filename){
        try {
            writer = new PrintWriter(new OutputStreamWriter(
                    new BufferedOutputStream(new FileOutputStream(filename)), "UTF-8"));
        } catch (UnsupportedEncodingException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void closeWriter(){
        writer.flush();
        writer.close();
    }

    public void writeToWriter(String line){
        if (writer!=null) {
            writer.println(line);
        }
    }
}

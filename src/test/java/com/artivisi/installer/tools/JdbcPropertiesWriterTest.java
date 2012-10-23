/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.installer.tools;

import de.schlichtherle.truezip.file.TFile;
import de.schlichtherle.truezip.file.TFileWriter;
import java.io.File;
import java.util.Arrays;
import org.junit.Test;


/**
 *
 * @author endy
 */
public class JdbcPropertiesWriterTest {
    
    @Test
    public void testGenerateJdbcProperties() throws Exception {
        TFileWriter writer = new TFileWriter(new TFile("src/test/resources/contoh.war/WEB-INF/lib/contoh-config.jar/jdbc.properties"));
        writer.write("jdbc.driver=com.mysql.jdbc.Driver\n");
        writer.write("jdbc.url=jdbc:mysql://localhost/coba\n");
        writer.write("jdbc.username=coba\n");
        writer.write("jdbc.password=rahasia\n");
        writer.close();
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VUExhibitionForm;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author System46
 */
public class FileChooser {
    
    private String filename;
    File file = new File(filename);
    
    FileInputStream fis = new FileInputStream(file);
    byte[]  image = new byte[(int)file.length()];
}

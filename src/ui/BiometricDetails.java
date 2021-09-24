/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
/**
 *
 * @author nidhitiwari
 */
public class BiometricDetails {
      String imageload()  
  {
    JFrame editorFrame = new JFrame("Image Demo");
    //  editorFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    FileDialog fd = new FileDialog(editorFrame, "Open", FileDialog.LOAD);  
    fd.show();
    String path = (fd.getDirectory() + fd.getFile());  
    return path; 
  }
}

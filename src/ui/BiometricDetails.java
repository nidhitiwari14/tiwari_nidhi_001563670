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
    String loadProfileImage()
  {
    JFrame editorFrame = new JFrame("Profile Image Load");
    FileDialog fd = new FileDialog(editorFrame, "Open", FileDialog.LOAD);  
    fd.show();
    String path = (fd.getDirectory() + fd.getFile());  
    return path; 
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprjct;

import static com.sun.javafx.scene.control.skin.Utils.getResource;
import static com.sun.webkit.graphics.WCImage.getImage;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author Hariprasad
 */
public class ConfigureFrame {
public static void ConfigureFrame(javax.swing.JFrame frame,String title,int type){
    frame.setLocationRelativeTo(null);
    frame.setTitle(title);
    //frame.setResizable(false);
    //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpeg")));
    if(type==1){
        frame.setSize(1920,1080);
    }
    else{
        frame.setSize(300,150);
    }
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
}
}
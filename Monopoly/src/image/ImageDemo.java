// https://alvinalexander.com/blog/post/jfc-swing/complete-java-program-code-open-read-display-image-file

// https://stackoverflow.com/questions/13516829/jfilechooser-change-default-directory-in-windows

package image;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

/**
 * A Java class to demonstrate how to load an image from disk with the
 * ImageIO class. Also shows how to display the image by creating an
 * ImageIcon, placing that icon an a JLabel, and placing that label on
 * a JFrame.
 * 
 * @author alvin alexander, alvinalexander.com
 */
public class ImageDemo
{
  public static void main(String[] args) throws Exception
  {
//	String filename = "resources/image/dbfinal.png";
	  String filename;
//		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		String userhome = System.getProperty("user.dir");
		JFileChooser jfc = new JFileChooser(userhome+"/resources/image");
		
		int returnValue = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			filename = selectedFile.getAbsolutePath();
			new ImageDemo(filename);
		}
  }

  public ImageDemo(final String filename) throws Exception
  {
    SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        JFrame editorFrame = new JFrame("Image Demo");
        editorFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        BufferedImage image = null;
        
        try
        {
          image = ImageIO.read(new File(filename));
        }
        catch (Exception e)
        {
          e.printStackTrace();
          System.exit(1);
        }
        ImageIcon imageIcon = new ImageIcon(image);
        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);
        editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);

        editorFrame.pack();
        editorFrame.setLocationRelativeTo(null);
        editorFrame.setVisible(true);
      }
    });
  }
}
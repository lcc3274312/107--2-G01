package bgm;

import java.io.File;

import javax.swing.JFileChooser;

import bgm.MP3;

public class Music {
	Thread gameAudio;
	MP3 mp3;
	String filename;

	public Music() {
		bgmplayer();
	}

	public void bgmplayer() {
		gameAudio = new Thread() {
			public void run() {

//		    	  filename = "resources/audio/level1.mp3";

				String userhome = System.getProperty("user.dir");
				System.out.println(userhome);
				JFileChooser jfc = new JFileChooser(userhome + "/resources/audio");

			

				
				mp3 = new MP3(userhome + "/resources/audio/song.mp3");
				mp3.setLoop(true);
				mp3.play();

			}
		};
		gameAudio.start();
	}
}
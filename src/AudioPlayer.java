import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Set;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

class Music extends Thread{

	public String filename;
	
	public Music(String filename){
		this.filename = filename;
	}
        public void run(){
                try {
                        FileInputStream fileInputStream = new FileInputStream(this.filename);
                        Player player = new Player(fileInputStream);
                        player.play();

                }catch(FileNotFoundException e) {
                    e.printStackTrace();
                }catch(JavaLayerException e) {
                    e.printStackTrace();
                }
        }   

}

public class AudioPlayer {
	
	ArrayList<Music> runningSongs = new ArrayList<Music>();

    //Switch for Playing certain Song
    public String inputCode(int pin) {
    	
		switch (pin) {
        case 1083: playSong("1083.mp3");
	    		return "1083";
        case 9344: playSong("9344.mp3");
				return "9344";
        case 4748: playSong("4748.mp3");
				return "4748";
        case 2359: playSong("2359.mp3");
				return "2359";
        case 9610: playSong("9610.mp3");
				return "9610";
        case 7949: playSong("7949.mp3");
				return "7949";
        case 8192: playSong("8192.mp3");
				return "8192";
        case 7686: playSong("7686.mp3");
				return "7686";
        case 5052: playSong("5052.mp3");
				return "5052";
        case 2884: playSong("2884.mp3");
				return "2884";
        case 1461: playSong("1461.mp3");
				return "1461";
        case 2197: playSong("2179.mp3");
				return "2197";
        case 6741: playSong("6741.mp3");
				return "6741";
        case 9158: playSong("9158.mp3");
				return "9158";
        case 7574: playSong("7574.mp3");
				return "7574";
        case 6047: playSong("6047.mp3");
				return "6047";
        case 1694: playSong("1694.mp3");
				return "1694";
        case 7644: playSong("7644.mp3");
				return "7644";
        case 1536: playSong("1536.mp3");
				return "1536";
        case 6926: playSong("6926.mp3");
				return "6926";
        case 1808: playSong("1808.mp3");
				return "Wrong one. Look again.";
        case 7658: playSong("7658.mp3");
				return "Wrong one. Look again.";
        case 3094: playSong("3094.mp3");
				return "Wrong one. Look again.";
        case 1998: playSong("1998.mp3");
				return "Victory. Your presents is in my closet, bottom shelf.";
        default: playSong("2541.mp3");
        		return "WRONG";
		}
	}
    
    //Play Song Function
    public void playSong(String filename) {

        Music music = new Music(filename);
        runningSongs.add(music);
        music.start();
    }
    
    public void stopSong() {

    	for(int ii = 0; ii < runningSongs.size(); ii++) {
    		Music n = runningSongs.get(ii);
    		
    		n.stop();
    	}
    }
}
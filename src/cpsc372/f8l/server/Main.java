package cpsc372.f8l.server;

import java.io.File;
import java.io.IOException;

import cpsc372.f8l.shared.Game;

public class Main {

	static public void main (String args[]) {
		
		File dat = new File("/home/zchessm/TrekUniverse.dat");
		
		GameDAO dao = new GameDAOImpl(dat);
		
		try {
			Game g = dao.parse();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

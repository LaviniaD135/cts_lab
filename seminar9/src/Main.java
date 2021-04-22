import seminar9.proxy.YoutubeLibrary;
import seminar9.proxy.YoutubeLibraryInterface;

public class Main {
public static void main(String[] args) {
		
		YoutubeLibraryInterface youtubelibrary=new YoutubeLibrary();
		System.out.println(youtubelibrary.listVideos());
		System.out.println(youtubelibrary.getVideoInfo(1));

	}

}

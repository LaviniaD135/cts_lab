package seminar9.proxy;

import seminar9.flyweight.Model3DFactory;
import seminar9.flyweight.ModelFlyweightInterface;
import seminar9.flyweight.ModelType;
import seminar9.flyweight.ScreenData;

public class Main {
	public static void main(String[] args) {
		//without proxy
		YoutubeLibraryInterface youtubelibrary=new YoutubeLibrary();
		System.out.println(youtubelibrary.listVideos());
		System.out.println(youtubelibrary.getVideoInfo(1));
		System.out.println(youtubelibrary.getVideoInfo(1));
		
		System.out.println("\n------------------");
		//with proxy
		YoutubeLibraryInterface youtubelibraryProxy=new YoutubeLibraryProxy();
		System.out.println(youtubelibrary.listVideos());
		System.out.println(youtubelibrary.getVideoInfo(1));
		
		System.out.println("\n------------------");
		ScreenData soldier1=new ScreenData("green", 99, 30, 100);
		ScreenData soldier2=new ScreenData("green", 20, 30, 40);
		
		ModelFlyweightInterface soldier1Interace=Model3DFactory.getModel(ModelType.SOLDIER);
		ModelFlyweightInterface soldier2Interace=Model3DFactory.getModel(ModelType.SOLDIER);
		soldier1Interace.display(soldier1);
		soldier1Interace.display(soldier2);
		soldier2Interace.display(soldier2);
		
	}

}

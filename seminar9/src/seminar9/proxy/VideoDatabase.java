package seminar9.proxy;

import java.util.ArrayList;

public class VideoDatabase {
private ArrayList<YoutubeVideo> listvideos;
	
	public VideoDatabase() {
		listvideos=new ArrayList<YoutubeVideo>();
		listvideos.add(new YoutubeVideo(1, "Guta - Eu sunt capitanu", 10));
		listvideos.add(new YoutubeVideo(2, "Cristu Dules - Zboara milioanele", 6));
	}

	public ArrayList<YoutubeVideo> getListvideos() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return listvideos;
	}
	
	
	public String getVideoInfo(int id)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		for(YoutubeVideo video:listvideos)
		{
			if(id== video.getId())
			{
				StringBuilder builder=new StringBuilder();
				builder.append(video.getTitle()).append(" - ").append(" takes you ").append(video.getDuration()).append(" minutes to watch");
				return builder.toString();
			}
			
		}
		return "Invalid id";
		
	}
}

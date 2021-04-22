package seminar9.proxy;

import java.util.ArrayList;

public class YoutubeLibrary implements YoutubeLibraryInterface{
	private VideoDatabase database;
	
	 public YoutubeLibrary() {
		this.database=new VideoDatabase();
	}
	
	@Override
	public String listVideos() {
		System.out.println("Fetching video from database...");
		ArrayList<YoutubeVideo> videolist=database.getListvideos();
		StringBuilder builder=new StringBuilder();
		for(YoutubeVideo video : videolist)
		{
			builder.append(video.getId()).append(" - ").append(video.getTitle()).append(" ").append(video.getDuration()).append("\n");
		}
		return builder.toString();
	}

	@Override
	public String getVideoInfo(int id) {
		System.out.println("Fetching videos info...");
		return database.getVideoInfo(id);
	}
}

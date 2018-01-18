package ergasia5;
public class Song {
	private String title;
	private Singer singer;
	private String url;
	static Song song[] = new Song[10];
	static int count = 0;
	public Song(String title,Singer singer,String url) {
		this.title = title;
		this.singer=singer;
		this.url=url;
		song[count]=this;
		++count;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Singer getSinger() {
		return singer;
	}
	public void setSinger(Singer singer) {
		this.singer = singer;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String toString() {
		return "Song [title=" + title + ",singer="+singer.getName()+",url="+url+"]";
	}
}

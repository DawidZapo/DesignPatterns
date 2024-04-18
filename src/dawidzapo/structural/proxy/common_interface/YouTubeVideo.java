package dawidzapo.structural.proxy.common_interface;

public class YouTubeVideo implements Video{
    private final String url;

    public YouTubeVideo(String url) {
        this.url = url;
    }

    @Override
    public void play() {
        System.out.println("Playing video at url: " + url);
    }
}

package dawidzapo.structural.proxy.proxy;

import dawidzapo.structural.proxy.common_interface.Video;
import dawidzapo.structural.proxy.common_interface.YouTubeVideo;

public class ProxyYouTubeVideo implements Video {
    private YouTubeVideo youTubeVideo;
    private final String url;

    public ProxyYouTubeVideo(String url) {
        this.url = url;
    }

    @Override
    public void play() {
        if(youTubeVideo == null){
            youTubeVideo = new YouTubeVideo(url);
        }
        youTubeVideo.play();
    }
}

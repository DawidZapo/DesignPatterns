package dawidzapo.structural.proxy;

import dawidzapo.structural.proxy.common_interface.Video;
import dawidzapo.structural.proxy.proxy.ProxyYouTubeVideo;

public class Demo {
    public static void main(String[] args) {
        Video video1 = new ProxyYouTubeVideo("example.url.com");
        Video video2 = new ProxyYouTubeVideo("exampleanother.url.com");

        video1.play();
        video2.play();
        video1.play(); // no new object
    }
}

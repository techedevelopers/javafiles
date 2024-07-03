package Abstraction;


abstract class MediaDevice {
    protected String name;

    public MediaDevice(String name) {
        this.name = name;
    }

    public abstract void displayDetails();

    static class AudioPlayer extends MediaDevice {
        private String songName;
        private String artist;

        public AudioPlayer(String name, String songName, String artist) {
            super(name);
            this.songName = songName;
            this.artist = artist;

        }

        public void play() {
            System.out.println("Playing audio: " + songName + " by " + artist);
        }

        public void displayDetails() {
            System.out.println("Media Player: " + name);
            System.out.println("Song: " + songName);
            System.out.println("Artist: " + artist);
        }

    }

    static class VideoPlayer extends MediaDevice {
        private String videoTitle;
        private double duration;

        public VideoPlayer(String name, String videoTitle, double duration) {
            super(name);
            this.videoTitle = videoTitle;
            this.duration = duration;
        }

        public void play() {
            System.out.println("Playing video: " + videoTitle + " Time: " + duration);
        }

        public void displayDetails() {
            System.out.println("Video Player: " + name);
            System.out.println("Video Title: " + videoTitle);
            System.out.println("Duration: " + duration);
        }

    }

    static class ImageDisplay extends MediaDevice {
        private String imageName;
        private String resolution;

        public ImageDisplay(String name, String imageName, String resolution) {
            super(name);
            this.imageName = imageName;
            this.resolution = resolution;
        }

        public void displayImage() {
            System.out.println("Displaying image: " + imageName + " Resolution: " + resolution);
        }

        public void displayDetails() {
            System.out.println("Device name: " + name);
            System.out.println("Image name: " + imageName);
            System.out.println("Resolution: " + resolution);
        }
    }

    public static void main(String[] args) {
        MediaDevice.VideoPlayer videoPlayer = new MediaDevice.VideoPlayer("Iphone", "The Canadian Dream", 120.0);
        MediaDevice.ImageDisplay imageDisplay = new MediaDevice.ImageDisplay("Iphone 15 Pro", "Canadian Rocky Mountain", "1040P");
        MediaDevice.AudioPlayer audioPlayer1 = new MediaDevice.AudioPlayer("Ipod", "Party in the U.S.A", "Miley Cyrus");

        System.out.println("Testing Audio Player");
        audioPlayer1.play();
        audioPlayer1.displayDetails();
        System.out.println();

        System.out.println("Testing Video Player");
        videoPlayer.play();
        videoPlayer.displayDetails();
        System.out.println();

        System.out.println("Testing Image Display");
        imageDisplay.displayImage();
        imageDisplay.displayDetails();
    }
}
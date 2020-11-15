package uk.yermak.audiobookconverter;

public class Version {
    private final static int MAJOR = 5;
    private final static int MINOR = 4;
    private final static int BUILD = 1;

    public static String getVersionString() {
        return "AudioBookConverter-" + MAJOR + "." + MINOR + "." + BUILD;
    }
}

        
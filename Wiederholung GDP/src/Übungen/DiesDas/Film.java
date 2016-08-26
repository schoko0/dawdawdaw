package Übungen.DiesDas;

import com.sun.media.jfxmediaimpl.NativeMediaPlayer;

/**
 * Created by sniendorf on 26.08.2016.
 */
public class Film extends Medium{
    public double duration;
    public Film (String title,
                 double duration) {
        super(title);
        this.duration = duration;
    }
    public double getDuration() {
        return duration;
    }
}

package command.audio;

/**
 * Created by xuan on 4/12/17.
 */
public class PlayCommand implements Command {
    private AudioPlayer myAudio;

    public PlayCommand(AudioPlayer audioPlayer) {
        myAudio = audioPlayer;
    }

    @Override
    public void execute() {
        myAudio.play();
    }
}

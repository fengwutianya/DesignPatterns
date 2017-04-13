package command.audio;

/**
 * Created by xuan on 4/12/17.
 */
public class RewindCommand implements Command {
    private AudioPlayer myAudio;

    public RewindCommand(AudioPlayer audioPlayer) {
        myAudio = audioPlayer;
    }

    @Override
    public void execute() {
        myAudio.rewind();
    }
}

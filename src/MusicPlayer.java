public class MusicPlayer extends Thread {
    int type;
    MusicBox mb = new MusicBox();

    public MusicPlayer(int type, MusicBox musicBox) {
        this.type = type;
        this.mb = musicBox;
    }

    @Override
    public void run() {
        switch (type) {
            case 1:
                mb.playMusicA();
                break;
            case 2:
                mb.playMusicB();
                break;
            case 3:
                mb.playMusicC();
                break;
        }
    }


}

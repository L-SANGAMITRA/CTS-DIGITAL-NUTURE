interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Strumming guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing piano");
    }
}

public class Music {
    public static void main(String[] args) {
        Playable g = new Guitar();
        Playable p = new Piano();
        g.play();
        p.play();
    }
}

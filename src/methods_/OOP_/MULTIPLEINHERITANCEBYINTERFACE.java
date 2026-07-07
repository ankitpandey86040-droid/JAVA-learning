package methods_.OOP_;

interface Camera{
    void clickPhoto();
}

interface MusicPlayer{
    void PlayMusic();
}

class Smartphone implements Camera,MusicPlayer {
    @Override
    public void clickPhoto() {
        System.out.println("clicked");
    }

    @Override
    public void PlayMusic() {
        System.out.println("music played ");
    }
}
    public class MULTIPLEINHERITANCEBYINTERFACE{
    public void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.clickPhoto();
        phone.PlayMusic();
    }
}

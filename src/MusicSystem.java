public class MusicSystem {
    int x = 10;
    Speakers s = new Speakers(){
        // We can declare variables and use variables inside the anonymus class
        int a = 10;

        //No constructors allowed inside the anonymus class
      public void playSound(){
          System.out.println(x + a);
          System.out.println("Play dolby sound");
      }
    };

    Radio r = new Radio() {
        @Override
        public void playRadio() {
            System.out.println("Play Radio");
        }
    };

    public void playMusic(){
        s.playSound();
        r.playRadio();
    }

    public static void main(String args[]){
        MusicSystem ms = new MusicSystem();
            ms.playMusic();
    }

}

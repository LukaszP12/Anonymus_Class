public class TestAnnonymousInner1 {
    public static void main(String args[]){
        Eatable e = new Eatable() {
            @Override
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        e.eat();
    }

}

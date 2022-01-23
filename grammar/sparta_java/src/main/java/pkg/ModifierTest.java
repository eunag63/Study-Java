package pkg;

public class ModifierTest {
    private void messageInside(){
        System.out.println("이건 private");
    }
    public void messageOutside(){
        System.out.println("이건 public");
        messageInside();
    }
    protected void messageProgected(){
        System.out.println("이건 protected");
    }
}

package mooc;

public class Cellhone extends Telphone implements IPlayGame{
    @Override
    public void call() {
        System.out.print("通过键盘打电话");
    }

    @Override
    public void message() {
        System.out.println("通过键盘发短信");
    }

    @Override
    public void playGame() {
        System.out.println("能玩游戏");
    }
}

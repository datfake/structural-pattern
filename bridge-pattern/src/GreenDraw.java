public class GreenDraw implements Draw {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Vẽ màu xanh cho vòng tròn: radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}

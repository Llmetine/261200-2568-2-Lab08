public static void main() {

    Turtle t1 = new Turtle(-150, 150);
    t1.penColor("red");
    t1.speed(5);

    Turtle t2 = new Turtle(150, 150);
    t2.penColor("green");
    t2.speed(5);

    Turtle t3 = new Turtle(0, -100);
    t3.penColor("blue");
    t3.speed(5);

    Thread thread1 = new Thread(() -> drawStar(t1, 100));
    Thread thread2 = new Thread(() -> drawStar(t2, 100));
    Thread thread3 = new Thread(() -> drawStar(t3, 100));

    thread1.start();
    thread2.start();
    thread3.start();
}

public static void drawStar(Turtle t, double size) {
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 3; j++) {
            t.forward(50);
            t.backward(50);
            t.right(45);
        }
        t.left(135);
        t.forward(50);
        for (int j = 0; j < 3; j++) {
            t.forward(30);
            t.backward(30);
            t.right(45);
        }
        t.left(135);
        t.backward(50);
        t.left(60);
    }
}

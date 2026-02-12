public static void main(String[] a) {

    Turtle bob = new Turtle();
    Turtle john = new Turtle();

    bob.speed(8);
    john.speed(8);
    int radius = 80;

    john.home();
    john.penColor("red");

    john.up();
    john.right(90);
    john.forward(radius);
    john.left(90);
    john.down();

    for(int i = 0; i < 360; i++) {
        john.forward(2 * Math.PI * radius / 360);
        john.left(1);
    }

    bob.home();
    bob.penColor("blue");

    bob.up();
    bob.forward(radius);
    bob.right(162);
    bob.down();

    for(int i = 0; i < 5; i++) {
        bob.forward(radius * 1.6);
        bob.right(144);
    }
}

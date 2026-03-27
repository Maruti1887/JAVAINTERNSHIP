package assignment.assignment14;
class Army {
    void arm() {
        System.out.println("the army it has");
    }

    public static void main(String[] args) {
        Navy n1 = new Navy();
        n1.arm();
    }
}

class Navy extends Army {
    void arm() {
        System.out.println("The army and navy it has");
    }
}

interface test {
    int square(int num);
}

class Arithmetic implements test {
    public int square(int num) {
        return num * num;
    }
}

class ToTestInt {
    public static void main(String[] args) {
        Arithmetic arithmeticObj = new Arithmetic();
        int number = 5;
        int result = arithmeticObj.square(number);
        System.out.println("Square of " + number + " is: " + result);
    }
}

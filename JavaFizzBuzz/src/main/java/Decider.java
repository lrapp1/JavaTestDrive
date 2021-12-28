public class Decider {
    public String decide(int input) {
        if (input % 5 == 0)
            return "Buzz";
        else {
            return "Fizz";
        }

    }
}

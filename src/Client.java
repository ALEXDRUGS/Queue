public class Client extends Queue{
    private final String num;
    public Client(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return " client " + num + " get cass number " + getCassNum();
    }
}
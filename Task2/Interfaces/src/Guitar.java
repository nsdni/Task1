public class Guitar implements Instrument{
    private int numCord;

    public int getNumCord() {
        return numCord;
    }

    public void setNumCord(int numCord) {
        this.numCord = numCord;
    }

    @java.lang.Override
    public void play() {
        System.out.println("Играет гитара");
    }
    @java.lang.Override
    public boolean equals(Object object) {
        if (this == o) return true;
        if (!(o instanceof Guitar)) return false;

        Guitar guitar = (Guitar) o;

        return numCord == guitar.numCord;
    }
    @java.lang.Override
    public int hashCode() {
        return numCord == guitar.numCord;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Guitar{" +
                "numCord=" + numCord +
                '}';
    }
}

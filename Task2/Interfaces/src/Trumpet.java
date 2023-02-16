public class Trumpet implements Instrument{
    private int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @java.lang.Override
    public void play() {
        System.out.println("Играет труба");
    }

        public boolean equals(Object object) {
            if (this == o) return true;
            if (!(o instanceof trumpet)) return false;

            Trumpet trumpet = (Trumpet) o;

            return size != null ? size.equals(trumpet.size) : trumpet.size == null;
        }

    public int hashCode() {
        long temp = Double.doubleToLongBits(diameter);
        return (int) (temp ^ (temp >>> 32));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Trumpet{" +
                "diameter=" + diameter +
                '}';
    }
}

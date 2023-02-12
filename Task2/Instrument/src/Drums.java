public class Drums implements Instrument{
    private string sizeDrum;

    public string getSizeDrum() {
        return sizeDrum;
    }
    @java.lang.Override
    public void setSizeDrum(string sizeDrum) {
        this.sizeDrum = sizeDrum;
    }

    @java.lang.Override
    public void play() {
        System.out.println("Играет барабан");
    }
    @java.lang.Override
    public boolean equals(Object object) {
        if (this == o) return true;
        if (!(o instanceof Caisse)) return false;

        Caisse caisse = (Caisse) o;

        return size != null ? size.equals(caisse.size) : caisse.size == null;
    }
    @java.lang.Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), sizeDrum);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Drums{" +
                "sizeDrum=" + sizeDrum +
                '}';
    }
}

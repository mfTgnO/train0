package effective_java_3rd.item8;

// Well-behaved client of resource with cleaner safety-net (Page 33)
public class Adult {
    public static void main(String[] args) {
        try (Room myRoom = new Room(7)) {
            System.out.println("Goodbye");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

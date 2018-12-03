/*
package effective_java_3rd.ch2.item8;

import java.lang.ref.Cleaner;

// An autocloseable class using a cleaner as a safety net (Page 32)
public class Room implements AutoCloseable {
    private static final Cleaner CLEANER = Cleaner.create();

    // Resource that requires cleaning. Must not refer to Room!
    private static class State implements Runnable {
        int numJunkPiels; // Number of junk piles in this room

        public State(int numJunkPiels) {
            this.numJunkPiels = numJunkPiels;
        }

        // Invoked by close method or cleaner
        @Override
        public void run() {
            System.out.println("Cleaning room");
            numJunkPiels = 0;
        }
    }

    // The state of this room, shared with our cleanable
    private final State state;

    // Our cleanable. Cleans the room when it’s eligible for gc
    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiels) {
        state = new State(numJunkPiels);
        cleanable = CLEANER.register(this, state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
}
*/

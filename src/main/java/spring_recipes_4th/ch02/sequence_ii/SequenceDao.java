package spring_recipes_4th.ch02.sequence_ii;

public interface SequenceDao {
    public Sequence getSequence(String sequenceId);

    public int getNextValue(String sequenceId);
}

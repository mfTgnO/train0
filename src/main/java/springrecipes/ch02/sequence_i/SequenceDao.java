package springrecipes.ch02.sequence_i;

public interface SequenceDao {
    Sequence getSequence(String sequenceId);

    int getNextValue(String sequenceId);
}

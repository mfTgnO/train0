package spring_recipes_4th.ch02.sequence_viii;

import javax.inject.Inject;
import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {
    @Inject
    @DatePrefixAnnotation
//    @NumberPrefixAnnotation
    private PrefixGenerator prefixGenerator;
    private String suffix;
    private int initial;
    private AtomicInteger counter = new AtomicInteger();

    public SequenceGenerator() {
    }

    public SequenceGenerator(PrefixGenerator prefixGenerator, String suffix, int initial) {
        this.prefixGenerator = prefixGenerator;
        this.suffix = suffix;
        this.initial = initial;
    }

    public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
        this.prefixGenerator = prefixGenerator;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuilder builder = new StringBuilder();
        builder.append(prefixGenerator.getPrefix())
                .append(initial)
                .append(counter.getAndIncrement())
                .append(suffix);
        return builder.toString();
    }
}

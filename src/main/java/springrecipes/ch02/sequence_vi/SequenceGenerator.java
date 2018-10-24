package springrecipes.ch02.sequence_vi;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {
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

    public String sequence() {
        StringBuilder builder = new StringBuilder();
        builder.append(prefixGenerator.getPrefix())
                .append(initial)
                .append(counter)
                .append(suffix);
        return builder.toString();
    }
}

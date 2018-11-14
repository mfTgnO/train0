package spring_recipes_4th.ch02.introducestates;

public class CounterImpl implements Counter {
    private int count;

    @Override
    public void increase() {
        count++;
    }

    @Override
    public int getCount() {
        return count;
    }
}

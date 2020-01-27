package chainresponsability;

import java.util.Objects;

public abstract class AbstractChain<T> implements Chain<T> {

    private Chain<T> next;

    @Override
    public void next(Chain<T> next) {
        this.next = next;
    }

    @Override public void handle(T param) {
        process(param);
        if (Objects.nonNull(this.next)) {
            this.next.handle(param);
        }
    }

    abstract void process(T param);
}

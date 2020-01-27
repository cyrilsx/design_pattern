package chainresponsability;

public interface Chain<T> {

    void handle(T param);

    void next(Chain<T> next);

}

package iterator;

import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        final HouseRepository houseRepository = new HouseRepository();
        houseRepository.addObject("cupboard");
        houseRepository.addObject("bed");
        houseRepository.addObject("forks");
        houseRepository.addObject("knifes");
        houseRepository.addObject("chairs");
        houseRepository.addObject("table");

        final Iterator<String> iterator = houseRepository.iterator();
        while (iterator.hasNext()) {
            System.out.println("next element " + iterator.next());
        }

    }

}

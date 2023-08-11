package pro.sky.basket.service;

import java.util.List;

public interface BasketService {
    void add(List<Long> items);

    List<Long> get();
}

package pro.sky.basket.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private List<Long> items;

    public Basket(){
        items = new ArrayList<>();
    }
    public void add(Long item){
        items.add(item);
    }
    public List<Long> getItems(){
        return items;
    }
}
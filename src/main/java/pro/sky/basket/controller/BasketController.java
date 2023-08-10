package pro.sky.basket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.basket.service.BasketService;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class BasketController {
    public final BasketService basketService;

    private BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam List<Long> items) {
        basketService.add(items);
        return "Items have been added";
    }

    @GetMapping(path = "/get")
    public List<Long> get() {
        return basketService.get();
    }
}







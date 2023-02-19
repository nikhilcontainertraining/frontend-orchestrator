package com.nikhil.containers.frontendorchestrator.api;

import com.nikhil.containers.frontendorchestrator.model.Card;
import com.nikhil.containers.frontendorchestrator.service.CardsHandler;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
public class AllCardsApi {

    @Autowired
    private CardsHandler cardsHandler;

    @GetMapping(value = "/card/credit")
    public ResponseEntity<List<Card>> getCards() {
        return ResponseEntity.ok(cardsHandler.getCards());
    }

}

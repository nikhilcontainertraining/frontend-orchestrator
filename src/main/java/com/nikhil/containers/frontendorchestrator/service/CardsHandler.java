package com.nikhil.containers.frontendorchestrator.service;

import com.nikhil.containers.frontendorchestrator.model.Card;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CardsHandler {

    static Logger log = LogManager.getLogger(CardsHandler.class);

    @Autowired
    private RestTemplate restTemplate;

    public List<Card> getCards() {
        log.info("Request to get cards from downstream/backend STARTED");

        ResponseEntity<List> getCardsResponse = null;
        try {
            getCardsResponse = restTemplate.getForEntity("http://be-dr-con:8080/cards", List.class);
        } catch (RestClientException e) {
            log.error("ERROR Occurred : Request to get cards from downstream/backend: " + e.getMessage());
            log.error(e.getStackTrace());
            throw new RuntimeException("INTERNAL_SERVER_ERROR");
        }

        List<Card> cards = getCardsResponse.getBody();


        log.info("Request to get cards from downstream/backend COMPLETE");
        return cards;
    }

}

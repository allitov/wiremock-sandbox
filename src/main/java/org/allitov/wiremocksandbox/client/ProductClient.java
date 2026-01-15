package org.allitov.wiremocksandbox.client;

import lombok.RequiredArgsConstructor;
import org.allitov.wiremocksandbox.model.Product;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class ProductClient {

    private final WebClient webClient;

    public Product getProductById(Integer id) {
        return webClient.get()
                .uri("/products/{id}", id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Product.class)
                .block();
    }
}

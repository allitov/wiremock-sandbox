package org.allitov.wiremocksandbox.controller;

import lombok.RequiredArgsConstructor;
import org.allitov.wiremocksandbox.client.ProductClient;
import org.allitov.wiremocksandbox.model.Product;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductClient client;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Product getProduct(@PathVariable Integer id) {
        return client.getProductById(id);
    }
}

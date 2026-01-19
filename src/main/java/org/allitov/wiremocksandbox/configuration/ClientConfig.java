package org.allitov.wiremocksandbox.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ClientConfig {

    @Value("${app.remote-server-url}")
    private String serverUrl;

    @Bean
    public WebClient webClient() {
        return WebClient.create(serverUrl);
    }
}

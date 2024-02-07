package com.kumandgo.moviedemo;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class MovieDataService
{
    public static Movie[] SearchMoviesByName(String searchTerm)
    {
        var client = WebClient.create("https://gateway.maverik.com/movie/api");

        var url = String.format("/movie/title/%s?source=web", searchTerm);

        return client.get().uri(url).retrieve()
                .bodyToMono(Movie[].class).onErrorResume(e -> Mono.empty())
                .block();
    }
}

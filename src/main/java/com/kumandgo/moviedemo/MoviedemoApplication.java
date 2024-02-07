package com.kumandgo.moviedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class MoviedemoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MoviedemoApplication.class, args);
        System.out.println("Hi there!");

        var result = MovieDataService.SearchMoviesByName("Titanic");

        for (var movie : result)
        {
            System.out.println(movie);
        }
    }

}


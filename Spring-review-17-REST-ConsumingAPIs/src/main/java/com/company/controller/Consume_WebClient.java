package com.company.controller;

import com.company.entity.Genre;
import com.company.entity.MovieCinema;
import com.company.repository.GenreRepository;
import com.company.repository.MovieCinemaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class Consume_WebClient {

    private WebClient webClient = WebClient.builder().baseUrl("http://localhost:8080").build();
    private final MovieCinemaRepository movieCinemaRepository;
    private final GenreRepository genreRepository;

    public Consume_WebClient(MovieCinemaRepository movieCinemaRepository, GenreRepository genreRepository) {
        this.movieCinemaRepository = movieCinemaRepository;
        this.genreRepository = genreRepository;
    }

    @GetMapping("/flux-movie-cinemas")
    public Flux<MovieCinema> readAllCinemaFlux(){
        return Flux.fromIterable(movieCinemaRepository.findAll());
    }

//    @GetMapping("/mono-movie-cinema/{id}")
//    public Mono<MovieCinema> readById(@PathVariable("id") Long id){
//        return Mono.just(movieCinemaRepository.findById(id).get());
//    }

    @GetMapping("/mono-movie-cinema/{id}")
    public ResponseEntity<Mono<MovieCinema>> readById(@PathVariable("id") Long id){
        return ResponseEntity.ok(Mono.just(movieCinemaRepository.findById(id).get()));
    }

    @PostMapping("/create-genre")
    public Mono<Genre> createGenre(@RequestBody Genre genre){
        return Mono.just(genreRepository.save(genre));
    }

    @DeleteMapping("/delete/genre/{id}")
    public Mono<Void> deleteGenre(@PathVariable("id") Long id){
        genreRepository.deleteById(id);
        return Mono.empty();
    }



//    ---------------------------WEBCLIENT---------------------------


    // not worked as expectation - it should be working but i did not find the problem
//    @GetMapping("/flux")
//    public Flux<MovieCinema> readWithWebClient(){
//
//        return webClient
//                .get()
//                .uri("/flux-movie-cinemas")
//                .retrieve()
//                .bodyToFlux(MovieCinema.class);
//
//    }



    // not worked as expectation - it should be working but i did not find the problem
//    @GetMapping("/mono/{id}")
//    public Mono<MovieCinema> readMonoWithWebClient(@PathVariable("id") Long id){
//
//        return webClient
//                .get()
//                .uri("/mono-movie-cinema/{id}",id)
//                .retrieve()
//                .bodyToMono(MovieCinema.class);
//
//    }
}

package dev.danvega.blog;

import dev.danvega.blog.model.Post;
import dev.danvega.blog.repository.PostRepository;
import dev.danvega.blog.service.JsonPlaceholderService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.List;

@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    @Bean
    JsonPlaceholderService jsonPlaceholderService() {
        WebClient client = WebClient.builder().baseUrl("https://jsonplaceholder.typicode.com").build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
        return factory.createClient(JsonPlaceholderService.class);
    }

    @Bean
    CommandLineRunner commandLineRunner(PostRepository repository, JsonPlaceholderService jsonPlaceholderService) {
        return args -> {
            List<Post> posts = jsonPlaceholderService.loadPosts();
            repository.saveAll(posts);
        };
    }

}

package dev.danvega.blog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

public record Post(@Id Integer id, Integer userId, @NotEmpty String title, String body, @JsonIgnore @Version Integer version) {

}

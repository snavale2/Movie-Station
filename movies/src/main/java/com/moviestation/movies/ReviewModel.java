package com.moviestation.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "review")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewModel {
    @Id
    private ObjectId id;
    private String body;

    public ReviewModel(String body) {
        this.body = body;
    }
}

package com.joicelima.desafioanotaai.domain.category;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document(collection = "categories")
@Getter
@Setter
@NoArgsConstructor
public class category {



    @Id
    private String id;
    private String title;
    private String description;
    private String ownerId;

}

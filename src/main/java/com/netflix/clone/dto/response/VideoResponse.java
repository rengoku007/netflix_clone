package com.netflix.clone.dto.response;

import com.netflix.clone.Entity.Video;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoResponse {

    private Long id;
    private String title;
    private String desciption;
    private Integer year;
    private String rating;
    private Integer duration;
    private String source;
    private String poster;
    private boolean published;
    private List<String> categories;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isInWatchList;

    public VideoResponse(
            Long id,
            String title,
            String desciption,
            Integer year,
            String rating,
            Integer duration,
            String src,
            String poster,
            boolean published,
            List<String> categories,
            Instant createdAt,
            Instant updatedAt
    ){
        this.id = id;
        this.title = title;
        this.desciption = desciption;
        this.year = year;
        this.rating = rating;
        this.duration = duration;
        this.source = src;
        this.poster = poster;
        this.published = published;
        this.categories =categories;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

}

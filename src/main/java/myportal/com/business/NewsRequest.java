package myportal.com.business;

import lombok.Data;

import java.util.Set;

@Data
public class NewsRequest {
    String title;
    String content;
    Set<Category> categories;
    Set<Tag> tags;
}

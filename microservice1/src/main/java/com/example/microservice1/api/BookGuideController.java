package com.example.microservice1.api;

import com.example.microservice1.domain.GuideItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/book-guide")
public class BookGuideController {

    @GetMapping("/{userId}")
    public List<GuideItem> getGuide(@PathVariable String userId) {
        return Collections.singletonList(new GuideItem(10, "Lord of the rings", "solid"));
    }
}

package com.example.bookingas.model;

import java.time.LocalDateTime;
import java.util.Objects;

public final class LiveStream {
    private final String id;
    private final String title;
    private final String description;
    private final String url;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;

    public LiveStream(String id, String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String id() {
        return id;
    }

    public String title() {
        return title;
    }

    public String description() {
        return description;
    }

    public String url() {
        return url;
    }

    public LocalDateTime startDate() {
        return startDate;
    }

    public LocalDateTime endDate() {
        return endDate;
    }
}
package com.example.tothepointnews.models.sources;

import java.util.List;

public class Sources {

    private List<Source> sources = null;
    private String status;

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

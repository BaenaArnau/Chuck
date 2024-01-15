package com.example.servingwebcontent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ChuckQuote(String icon_url, String id, String url, String value) {
}

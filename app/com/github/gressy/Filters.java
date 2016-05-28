package com.github.gressy;

import com.github.gressy.entities.util.JsonExceptionFilter;
import play.filters.cors.CORSFilter;
import play.http.HttpFilters;
import play.mvc.EssentialFilter;

import javax.inject.Inject;

public class Filters implements HttpFilters {

    @Inject
    CORSFilter corsFilter;

    @Inject
    JsonExceptionFilter jsonExceptionFilter;

    public EssentialFilter[] filters() {
        return new EssentialFilter[] {
                corsFilter.asJava(),
                jsonExceptionFilter
        };
    }

}

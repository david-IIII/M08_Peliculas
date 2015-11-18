package com.example.david.peliculas.provider.peliculas;

import com.example.david.peliculas.provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Data model for the {@code peliculas} table.
 */
public interface PeliculasModel extends BaseModel {

    /**
     * Get the {@code adult} value.
     * Can be {@code null}.
     */
    @Nullable
    Boolean getAdult();

    /**
     * Get the {@code backdrop_path} value.
     * Can be {@code null}.
     */
    @Nullable
    String getBackdropPath();

    /**
     * Get the {@code id} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getId();

    /**
     * Get the {@code original_language} value.
     * Can be {@code null}.
     */
    @Nullable
    String getOriginalLanguage();

    /**
     * Get the {@code original_title} value.
     * Can be {@code null}.
     */
    @Nullable
    String getOriginalTitle();

    /**
     * Get the {@code overview} value.
     * Can be {@code null}.
     */
    @Nullable
    String getOverview();

    /**
     * Get the {@code release_date} value.
     * Can be {@code null}.
     */
    @Nullable
    String getReleaseDate();

    /**
     * Get the {@code poster_path} value.
     * Can be {@code null}.
     */
    @Nullable
    String getPosterPath();

    /**
     * Get the {@code popularity} value.
     * Can be {@code null}.
     */
    @Nullable
    Double getPopularity();

    /**
     * Get the {@code title} value.
     * Can be {@code null}.
     */
    @Nullable
    String getTitle();

    /**
     * Get the {@code video} value.
     * Can be {@code null}.
     */
    @Nullable
    Boolean getVideo();

    /**
     * Get the {@code vote_average} value.
     * Can be {@code null}.
     */
    @Nullable
    Double getVoteAverage();

    /**
     * Get the {@code vote_cont} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getVoteCont();
}
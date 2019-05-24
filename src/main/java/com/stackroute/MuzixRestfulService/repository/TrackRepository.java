package com.stackroute.MuzixRestfulService.repository;

import com.stackroute.MuzixRestfulService.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface TrackRepository extends JpaRepository<Track, Integer> {

    @Query(value = "SELECT * FROM track WHERE TRACK_NAME=?1", nativeQuery = true)
    public List<Track> findTrackByName(String name);

}

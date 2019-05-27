package com.stackroute.MuzixRestfulService.repository;


import com.stackroute.MuzixRestfulService.domain.Track;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private TrackRepository trackRepository;
    private Track track;

    @Before
    public void setUp()
    {
        track = new Track();
        track.setTrackName("John");
        track.setTrackId(101);
        track.setComments("Jenny");

    }

    @After
    public void tearDown(){

        trackRepository.deleteAll();
    }


    @Test
    public void testSaveUser(){
     trackRepository.save(track);
     Track fetchUser = trackRepository.findById(track.getTrackId()).get();
        Assert.assertEquals(101,fetchUser.getTrackId());

    }

    @Test
    public void testSaveUserFailure(){
        Track testUser = new Track(34,"Harry123","Jenny");
        trackRepository.save(track);
        Track fetchUser = trackRepository.findById(track.getTrackId()).get();
        Assert.assertNotSame(testUser,fetchUser);
    }

    @Test
    public void testGetAllUser(){
        Track u = new Track(10,"Johny12","Someone");
        Track u1 = new Track(11,"Harry12","Anyone");
        trackRepository.save(u);
        trackRepository.save(u1);

        List<Track> list = trackRepository.findAll();
        Assert.assertEquals("Johny12",list.get(0).getTrackName());




    }


}

package com.duckranger.goodproject.domain;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.duckranger.goodproject.service.TrampsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:servlet-context.xml", "classpath*:datasource.xml" })
public class TrampTest {

    @Autowired
    TrampsService trampsService;

    @Test
    public void CreateTest() {
	Tramp t = new Tramp();
	t.setName("Tongariro Northern Circuit");
	t.setDistance(48.0);
	t.setDifficulty(Difficulty.EASY_TRAMP);
	trampsService.save(t);
	long id = t.getId();
	t = null;
	Tramp tt = trampsService.findOne(id);
	Assert.assertEquals("Tongariro Northern Circuit", tt.getName());
	tt = null;
    }

    public TrampsService getTrampsService() {
	return trampsService;
    }

    public void setTrampsService(TrampsService trampsService) {
	this.trampsService = trampsService;
    }

}
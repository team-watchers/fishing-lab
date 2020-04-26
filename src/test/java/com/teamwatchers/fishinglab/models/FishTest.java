package com.teamwatchers.fishinglab.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.teamwatchers.fishinglab.daos.FishDao;

@DataJpaTest
public class FishTest {

  @Autowired
  private FishDao fishDao;

  @Test
  public void test() {
    // Given
    String name = "붕어";

    // When
    Fish fish = new Fish();
    fish.setName(name);

    this.fishDao.save(fish);

    // Then
    Iterable<Fish> fishes = this.fishDao.findAll();

    assertEquals(fish, fishes.iterator().next());
  }
}

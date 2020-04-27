package com.teamwatchers.fishinglab.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.teamwatchers.fishinglab.models.types.HabitatType;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "fishes")
public class Fish {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Getter @Setter
  @Column(name = "name", nullable = false)
  private String name;

  @Getter @Setter
  @ElementCollection(targetClass = HabitatType.class)
  @Enumerated(EnumType.STRING)
  @Column(name = "habitats")
  private List<HabitatType> habitats = new ArrayList<HabitatType>();

  // TODO:: FishingPoint Model
  // @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  // @JoinTable(
  //   name = "fishes_fishing_points",
  //   joinColumns = @JoinColumn(name = "fish_id", referencedColumnName = "id"),
  //   inverseJoinColumns = @JoinColumn(name = "fishing_point_id", referencedColumnName = "id")
  // )
  // @Column(name = "fishing_points")
  // private List<FishingPoint> fishingPoints = new ArrayList<>();
}

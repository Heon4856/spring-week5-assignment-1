package com.codesoom.assignment.user.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class User {
  @Id
  @GeneratedValue
  private Long id;

  private String name;

  private String email;

  private String password;

  @Builder
  public User(Long id, String name, String email, String password) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
  }

  public void changeWith(User source) {
    this.name = source.name;
    this.email = source.email;
    this.password = source.password;
  }
}

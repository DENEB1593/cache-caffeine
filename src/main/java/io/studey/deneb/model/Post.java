package io.studey.deneb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post {

  @Id @GeneratedValue
  private Long id;

  private String name;

  private String content;

  public Post() { }

  public Post(String name, String content) {
    this.name = name;
    this.content = content;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return "Post{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", content='" + content + '\'' +
      '}';
  }
}

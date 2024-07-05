package com.piotrba.spring_docker_aws;

public class Book {

    private Long id;
    private String name;
    private String suthor;

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

    public String getSuthor() {
        return suthor;
    }

    public void setSuthor(String suthor) {
        this.suthor = suthor;
    }

    public Book(Long id, String name, String suthor) {
        this.id = id;
        this.name = name;
        this.suthor = suthor;
    }




}

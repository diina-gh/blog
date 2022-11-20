package com.blog.blog.models._abstract;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


@MappedSuperclass
public class AbstractEntity {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    @Column(nullable = true)
    private boolean activated = false;

    @CreatedDate    
    private Instant createdAt;

    @LastModifiedDate    
    private Instant updatedAt;

    public AbstractEntity() {
    }

    public AbstractEntity( boolean activated) {
        this.activated = activated;
    }

    public Long getId() {
        return id;
    }

    public boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedeAt() {
        return updatedAt;
    }

    
}

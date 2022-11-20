package com.blog.blog.models._abstract;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@MappedSuperclass
@Getter
@Setter 
@NoArgsConstructor
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

    public AbstractEntity( boolean activated) {
        this.activated = activated;
    }

}

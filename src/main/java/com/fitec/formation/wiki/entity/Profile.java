package com.fitec.formation.wiki.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "T_PROFILE")
@Getter
@Setter
@NoArgsConstructor
public class Profile implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PROFILE")
    private Long idProfile;
    @Column(name = "VALUE")
    private String profile;

    public Profile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return profile + " [" + idProfile + "]";
    }
}

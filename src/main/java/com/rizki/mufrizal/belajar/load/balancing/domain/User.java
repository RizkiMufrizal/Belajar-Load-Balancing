package com.rizki.mufrizal.belajar.load.balancing.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com> <https://RizkiMufrizal.github.io>
 * @Since 10 August 2016
 * @Time 21:29
 * @Project Spring-Boot-Load-Balancing
 * @Package com.rizki.mufrizal.belajar.load.balancing.domain
 * @File User
 */
@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    @Id
    @Column(name = "username", length = 30, nullable = false)
    private String username;

    @Column(name = "password", length = 150, nullable = false)
    private String password;

    @Column(name = "enable", nullable = false)
    private Boolean enable;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private Set<UserRole> userRoles = new HashSet<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}

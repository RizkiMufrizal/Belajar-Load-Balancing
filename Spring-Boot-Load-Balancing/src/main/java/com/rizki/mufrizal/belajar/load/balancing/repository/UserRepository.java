package com.rizki.mufrizal.belajar.load.balancing.repository;

import com.rizki.mufrizal.belajar.load.balancing.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com> <https://RizkiMufrizal.github.io>
 * @Since 10 August 2016
 * @Time 21:35
 * @Project Spring-Boot-Load-Balancing
 * @Package com.rizki.mufrizal.belajar.load.balancing.repository
 * @File UserRepository
 */
public interface UserRepository extends PagingAndSortingRepository<User, String> {

    @Query("select u from User u left join fetch u.userRoles pd where u.username = :username")
    User loginUser(@Param("username") String username);

}
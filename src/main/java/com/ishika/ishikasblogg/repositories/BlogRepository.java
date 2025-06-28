package com.ishika.ishikasblogg.repositories;

import com.ishika.ishikasblogg.entities.Blog;
import com.ishika.ishikasblogg.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

}

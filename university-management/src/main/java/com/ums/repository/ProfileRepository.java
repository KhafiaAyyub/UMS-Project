package com.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ums.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}

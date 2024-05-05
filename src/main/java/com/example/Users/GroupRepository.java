package com.example.Users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@SuppressWarnings("unused")
public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByName(String name);
}

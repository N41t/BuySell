package com.belozerov.buysell.repositories;

import com.belozerov.buysell.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}

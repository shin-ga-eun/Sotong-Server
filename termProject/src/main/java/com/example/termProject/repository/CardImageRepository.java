package com.example.termProject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.termProject.domain.entity.Card;
import com.example.termProject.domain.entity.CardImage;

public interface CardImageRepository extends JpaRepository<CardImage, Long>{

	Optional<CardImage> findByCard(Card card);
	
}

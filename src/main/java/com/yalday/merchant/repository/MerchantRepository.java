package com.yalday.merchant.repository;

import com.yalday.merchant.domain.Merchant;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Merchant entity.
 */
@SuppressWarnings("unused")
public interface MerchantRepository extends MongoRepository<Merchant,String> {

    Merchant findByName(String name);

}

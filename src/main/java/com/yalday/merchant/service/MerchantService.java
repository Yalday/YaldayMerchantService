package com.yalday.merchant.service;

import com.yalday.merchant.domain.Merchant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Service Interface for managing Merchant.
 */
public interface MerchantService {

    /**
     * Save a merchant.
     *
     * @param merchant the entity to save
     * @return the persisted entity
     */
    Merchant save(Merchant merchant);

    /**
     *  Get all the merchants.
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<Merchant> findAll(Pageable pageable);

    /**
     *  Get the "id" merchant.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    Merchant findOne(String id);

    /**
     *  Delete the "id" merchant.
     *
     *  @param id the id of the entity
     */
    void delete(String id);
}
